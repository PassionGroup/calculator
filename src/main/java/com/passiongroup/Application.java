package com.passiongroup; /**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved/
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author Finderhu
 * @version $Id: com.passiongroup.Application.java, V 0.1 2016-10-31 14:29 Finderhu Exp $
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args){
        ApplicationContext applicationContext = SpringApplication.run(Application.class, args);
    }

}
