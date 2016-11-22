package com.passiongroup.dal.mapper;

import com.passiongroup.web.record.recordinfo.RecordInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * @author Finderhu
 * @version $Id: RecordInfoMapperTest.java, V 0.1 2016-11-22 22:50 Finderhu Exp $
 */
@SpringBootTest
@DirtiesContext
public class RecordInfoMapperTest extends AbstractTestNGSpringContextTests{
    @Autowired
    private RecordInfoMapper recordInfoMapper;
    @Test
    public void testFindRecordInfoByUsername() throws Exception {
        String expEquation = "1+1";
        String actEquation = recordInfoMapper.findRecordInfoByUsername("finder").getEquation();
        assertEquals(actEquation,expEquation);
    }

}