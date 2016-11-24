package com.passiongroup.dal.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by longhuai.hlh on 2016/11/24.
 */
@SpringBootTest
@DirtiesContext
public class UserRepositoryImplTest extends AbstractTestNGSpringContextTests{
    @Autowired
    private UserRepository userRepository;
    @Test
    public void testGetPassword() throws Exception {
        String exppassword = "123";
        String actPassword = userRepository.getPassword("finder");
        assertEquals(actPassword,exppassword);
    }

}