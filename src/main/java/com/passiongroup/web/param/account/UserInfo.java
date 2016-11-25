/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved/
 */
package com.passiongroup.web.param.account;


import com.passiongroup.biz.model.GenderEnums;

/**
 *
 * @author Finderhu
 * @version $Id: UserInfo.java, V 0.1 2016-10-31 19:01 Finderhu Exp $
 */
public class UserInfo {
    // TODO: 2016/10/31 @石丰华
    private String name;

    private Integer age ;
    private GenderEnums gender;

    private String email;
    private String password;


    public UserInfo(String name, Integer age, String email, String password) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() { return email;}

    public void setEmail(String email) { this.email = email;}

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;}
    }

