package com.passiongroup.biz.operator;

import com.passiongroup.biz.model.User;
import com.passiongroup.dal.mapper.UserMapper;
import com.passiongroup.dal.repository.UserRepository;
import com.passiongroup.util.Result;
import com.passiongroup.web.param.account.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
import static org.testng.Assert.assertEquals;

/**
 * Created by longhuai.hlh on 2016/12/5.
 */
public class LoginHandlerImplTest {
    String userInfo = null;

    @Autowired
    private UserRepository userRepository;
    private UserMapper userMapper;

    @Test
    public void testLogin1() throws Exception {
        Result result = new Result(false,null,null);
        result.setErrorCode(-1);
        assertEquals(new Integer(-1), result.getErrorCode());
    }

    @Test
    public void testLogin2() throws Exception {
        User user=new User( "username",1,"email","password","message");
        Result result = new Result(false,null,null);
        //assertTrue(StringUtils.hasText(user.getName()) & !userRepository.isUserNameExist(user.getName()));
        result.setErrorCode(-2);
        assertEquals(new Integer(-2), result.getErrorCode());
        String userInfo = user.getName();
        assertEquals( "username" ,userInfo);
    }

    @Test
    public void testLogin3() throws Exception {
        User user=new User( "username",1,"email","password","message");
        Result result = new Result(false,null,null);
        //assertTrue(StringUtils.hasText(user.getEmail()) & !userRepository.isUserNameExist(user.getName()));
        result.setErrorCode(-2);
        assertEquals(new Integer(-2), result.getErrorCode());
        String userInfo = user.getEmail();
        assertEquals( "email" ,userInfo);
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
        assertTrue(!StringUtils.hasText(user.getName()));
   }

    @Test
    public void testCheckParam2() throws Exception {
        User user=new User( "",1,"","password","message");
        assertTrue(!StringUtils.hasText(user.getName()) &
                !StringUtils.hasText(user.getEmail()));
    }

    @Test
    public void testCheckParam3() throws Exception {
        User user=new User( "",1,"email","password","message");
        assertTrue((StringUtils.hasText(user.getName()) ||
                StringUtils.hasText(user.getEmail())) & StringUtils.hasText(user.getPassword()));
    }

    @Test
    public void testCheckParam4() throws Exception {
        User user=new User( "",1,"email","","message");
        assertTrue((StringUtils.hasText(user.getName()) ||
                StringUtils.hasText(user.getEmail())) & !StringUtils.hasText(user.getPassword()));
    }


}