package com.passiongroup.biz.operator;

import com.passiongroup.biz.model.User;
import com.passiongroup.dal.repository.UserRepository;
import com.passiongroup.util.CCException;
import com.passiongroup.util.Result;
import mockit.Expectations;
import mockit.Injectable;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
/**
 * @author Finderhu
 * @version $Id: RegisterHandlerTest.java, V 0.1 2016-11-29 23:08 Finderhu Exp $
 */
public class RegisterHandlerTest {
    @Injectable
    private UserRepository userRepository;

    private RegisterHandlerImpl registerHandler = new RegisterHandlerImpl();



    @Test(dataProvider = "paramExc")
    public void testRegisterParamExc(User user,Integer expectErrorCode,String msg) throws Exception{
        Result result = registerHandler.register(user);
        assertEquals(result.getErrorCode(),expectErrorCode,msg);
    }
    @DataProvider(name = "paramExc")
    public static Object[][] paramExcDataProvider(){
        return new Object[][]{
                new Object[]{null,-1,"输入参数为空"},
                new Object[]{new User("username",1,"email","password","message"),-1,"用户名为空"},
                new Object[]{new User("username",1,"email","password","message"),-1,"邮箱为空"},
                new Object[]{new User("username",1,"email","password","message"),-1,"密码为空"},
                new Object[]{new User("username",1,"email","password","message"),-1,"用户名、邮箱、密码都为空"}
        };
    }

    @Test
    public void testRegisterUserNameExistExc() throws Exception {
        new Expectations(){{
           userRepository.isUserNameExist(anyString);result = true;
        }};
        registerHandler.setUserRepository(userRepository);
        Result result = registerHandler.register(new User("username",1,"email","password","message"));
        assertEquals(result.getErrorCode().intValue(),-2,"用户名已经存在");
    }

    @Test
    public void testRegisterEmailExistExc() throws Exception {
        new Expectations(){{
            userRepository.isUserNameExist(anyString);result = false;
            userRepository.isEmailExist(anyString);result = true;
        }};
        registerHandler.setUserRepository(userRepository);
        Result result = registerHandler.register(new User("username",1,"email","password","message"));
        assertEquals(-3,result.getErrorCode().intValue(),"邮箱已经被使用");
    }

    @Test
    public void testRegisterAddUserExc() throws CCException {
        new Expectations(){{
            userRepository.isUserNameExist(anyString);result = false;
            userRepository.isEmailExist(anyString);result = false;
            userRepository.addUser(withAny(new User()));result = new CCException();
        }};
        registerHandler.setUserRepository(userRepository);
        Result result = registerHandler.register(new User("username",1,"email","password","message"));
        assertEquals(result.getErrorCode().intValue(),-4,"用户数据写入数据库出错");
    }

    @Test
    public void testRegisterNormal() throws Exception{
        new Expectations(){{
            userRepository.isUserNameExist(anyString);result = false;
            userRepository.isEmailExist(anyString);result = false;
        }};
        registerHandler.setUserRepository(userRepository);
        Result result = registerHandler.register(new User("username",1,"email","password","message"));
        assertTrue(result.getSuccess());
    }
}