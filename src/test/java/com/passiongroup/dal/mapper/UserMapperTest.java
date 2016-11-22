package com.passiongroup.dal.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * @author Finderhu
 * @version $Id: UserMapperTest.java, V 0.1 2016-11-22 22:53 Finderhu Exp $
 */
@SpringBootTest
@DirtiesContext
public class UserMapperTest extends AbstractTestNGSpringContextTests{
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testFindUserByUsername() throws Exception {
        Integer expAge = 24;
        Integer actAge = userMapper.findUserByUsername("finder").getAge();
        assertEquals(actAge,expAge);
    }

}