/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved/
 */
package com.passiongroup.web.param.account;



/**
 *
 * @author Finderhu
 * @version $Id: UserInfo.java, V 0.1 2016-10-31 19:01 Finderhu Exp $
 */
public class UserInfo {
    // TODO: 2016/10/31 @石丰华
    private String name;
    private Integer age;
    // TODO: 2016/11/24 把gender类型改成String 
    private GenderEnum gender;
    private String email;
    private String password;

    public UserInfo(String name, String email, String password) {
        this.name = name;
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
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;}
    }
