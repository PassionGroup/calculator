package com.passiongroup.web.account;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by Administrator on 2016/11/25.
 */
public class UserInfoTest {
    @Test
    public void testGetEmail() throws Exception {
        UserInfo userinfo=new UserInfo("lisi",  new Integer(18)," ","321");
        userinfo.setEmail("123@qq.com");
        assertEquals("123@qq.com",userinfo.getEmail());
    }

    @Test
    public void testSetEmail() throws Exception {
        UserInfo userinfo=new UserInfo("bob",  new Integer(18),"123@qq.com","321");
        userinfo.getEmail();
        assertEquals("123@qq.com",userinfo.getEmail());
    }

    @Test
    public void testGetAge() throws Exception {
        UserInfo userinfo=new UserInfo("lisi", new Integer(18),"123@qq.com","321");
        userinfo.setAge( new Integer(18));
        assertEquals( new Integer(18),userinfo.getAge());
    }

    @Test
    public void testSetAge() throws Exception {
        UserInfo userinfo=new UserInfo("bob",  new Integer(21),"123@qq.com","321");
        userinfo.getAge();
        assertEquals( new Integer(21),userinfo.getAge());
    }

    @Test
    public void testGetPassword() throws Exception {
        UserInfo userinfo=new UserInfo("", new Integer(18),"123@qq.com","");
        userinfo.setPassword("321");
        assertEquals("321",userinfo.getPassword());
    }

    @Test
    public void testSetPassword() throws Exception {
        UserInfo userinfo=new UserInfo("bob", new Integer(18),"123@qq.com","321");
        userinfo.getPassword();
        assertEquals("321",userinfo.getPassword());
    }

    @Test
    public void testGetName() throws Exception {

        UserInfo userinfo=new UserInfo("", new Integer(18),"123@qq.com","321");
        userinfo.setName("lisi");
        assertEquals("lisi",userinfo.getName());

    }

    @Test
    public void testSetName() throws Exception {
        UserInfo userinfo=new UserInfo("bob", new Integer(18),"123@qq.com","321");
        userinfo.getName();
        assertEquals("bob",userinfo.getName());
    }

}