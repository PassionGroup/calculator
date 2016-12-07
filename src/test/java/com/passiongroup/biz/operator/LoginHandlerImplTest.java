package com.passiongroup.biz.operator;

import com.passiongroup.biz.model.User;
import com.passiongroup.dal.mapper.UserMapper;
import com.passiongroup.dal.repository.UserRepository;
import com.passiongroup.util.Result;
import com.passiongroup.web.param.account.UserInfo;
import mockit.Expectations;
import mockit.Mocked;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
import static org.testng.Assert.assertEquals;

/**
 * Created by longhuai.hlh on 2016/12/5.
 */
public class LoginHandlerImplTest {

//    @Autowired
//    private UserRepository userRepository;
//    private UserMapper userMapper;从数据库取东西，只在repository里面用，其他类不直接使用

    @Mocked
    private UserRepository userRepository;

    @Test
    public void testLoginUsernameIsNotExist() throws Exception {
        new Expectations(){{
           userRepository.isUserNameExist(anyString);result = false;times = 1;
        }};
        LoginHandlerImpl loginHandler = new LoginHandlerImpl();
        loginHandler.setUserRepository(userRepository);
        Result result = loginHandler.login(new User("username",12,"email","password","message"));
        assertEquals(result.getErrorCode().intValue(),-2);
    }

    @Test
    public void testLoginEmailIsNotExist() throws Exception {
        new Expectations(){{
            userRepository.isUserNameExist(anyString);result = true;times = 1;
            userRepository.isEmailExist(anyString);result = false;times = 1;
        }};
        LoginHandlerImpl loginHandler = new LoginHandlerImpl();
        loginHandler.setUserRepository(userRepository);
        Result result = loginHandler.login(new User("username",12,"email","password","message"));
        assertEquals(result.getErrorCode().intValue(),-2);
    }

    @Test
    public void testLoginPasswordIsNotTrue() throws Exception {
        new Expectations(){{
            userRepository.isUserNameExist(anyString);result = true;times = 1;
            userRepository.isEmailExist(anyString);result = true;times = 1;
            userRepository.getPassword(anyString).equals(withAny(new User()).getPassword());result=false;times=1;
        }};
        LoginHandlerImpl loginHandler = new LoginHandlerImpl();
        loginHandler.setUserRepository(userRepository);
        Result result = loginHandler.login(new User("username",12,"email","password","message"));
        assertEquals(result.getErrorCode().intValue(),0);
    }

    @Test
    public void testLoginPasswordIsTrue() throws Exception {
        //User user= new User("username",12,"email","password","message");
        new Expectations(){{
            userRepository.isUserNameExist(anyString);result = true;times = 1;
            userRepository.isEmailExist(anyString);result = true;times = 1;
            userRepository.getPassword(anyString).equals(withAny(new User()).getPassword());result=true;times=1;
        }};
        LoginHandlerImpl loginHandler = new LoginHandlerImpl();
        loginHandler.setUserRepository(userRepository);
        userRepository.updateUserState(new User("username",12,"email","password","message"));
        Result result = loginHandler.login(new User("username",12,"email","password","message"));
        assertTrue(result.getSuccess());
        assertEquals("",new User().getPassword());
        //assertEquals(Object resultObject,result.getResultObject());
    }

    @Test
    public void testLogin4() throws Exception {
        //String passwordInDatabase = userRepository.getPassword(userInfo);
        //User user=new User( "username",1,"email","password","message");
        Result result = new Result(false,null,null);
        //assertTrue(!passwordInDatabase.equals(user.getPassword()));
        result.setErrorCode(0);
        assertEquals(new Integer(0), result.getErrorCode());
    }

    @Test
    public void testLogin5() throws Exception {
        //String passwordInDatabase = userRepository.getPassword(userInfo);
        User user=new User( "username",1,"email","","message");
        Result result = new Result(false,null,null);
        //assertTrue(passwordInDatabase.equals(user.getPassword()));
        //userRepository.updateUserState(user);
        result.setSuccess(true);
        assertTrue(result.getSuccess());
        user.setPassword("");
        assertEquals("", user.getPassword());
        result.setResultObject(user);
        assertEquals(user,result.getResultObject());
    }

     @Test
    public void testCheckParam1() throws Exception {
         User user=new User();
         user.setName("username");
         LoginHandlerImpl loginHandler = new LoginHandlerImpl();
         boolean actual = loginHandler.checkParam(user);
         assertTrue(!actual);
   }

    @Test
    public void testCheckParam2() throws Exception {
        User user=new User( "",1,"","password","message");
        LoginHandlerImpl loginHandler = new LoginHandlerImpl();
        boolean actual= loginHandler.checkParam(user);
        assertTrue(!actual);
    }

    @Test
    public void testCheckParam3() throws Exception {
        User user=new User( "username",1,"email","","message");
        LoginHandlerImpl loginHandler = new LoginHandlerImpl();
        boolean actual= loginHandler.checkParam(user);
        assertTrue(!actual);
    }

    @Test
    public void testCheckParam4() throws Exception {
        User user=new User( "username",1,"email","password","message");
        LoginHandlerImpl loginHandler = new LoginHandlerImpl();
        boolean actual= loginHandler.checkParam(user);
        assertTrue(actual);
    }


}