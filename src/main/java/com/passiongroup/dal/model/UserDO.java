/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved/
 */
package com.passiongroup.dal.model;

/**
 *
 * @author Finderhu
 * @version $Id: UserDO.java, V 0.1 2016-11-22 22:26 Finderhu Exp $
 */
public class UserDO {
    private String username;
    private Integer age;
    private Integer gender;
    private String email;
    private String password;

    public UserDO() {
    }

    public UserDO(String username, Integer age, Integer gender, String email, String password) {
        this.username = username;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.password = password;
    }

    /**
     * Getter method for property <tt>username</tt>.
     *
     * @return property value of username
     */

    public String getUsername() {
        return username;
    }

    /**
     * Setter method for property <tt>username</tt>.
     *
     * @param username value to be assigned to property username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Getter method for property <tt>age</tt>.
     *
     * @return property value of age
     */

    public Integer getAge() {
        return age;
    }

    /**
     * Setter method for property <tt>age</tt>.
     *
     * @param age value to be assigned to property age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * Getter method for property <tt>gender</tt>.
     *
     * @return property value of gender
     */

    public Integer getGender() {
        return gender;
    }

    /**
     * Setter method for property <tt>gender</tt>.
     *
     * @param gender value to be assigned to property gender
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * Getter method for property <tt>email</tt>.
     *
     * @return property value of email
     */

    public String getEmail() {
        return email;
    }

    /**
     * Setter method for property <tt>email</tt>.
     *
     * @param email value to be assigned to property email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter method for property <tt>password</tt>.
     *
     * @return property value of password
     */

    public String getPassword() {
        return password;
    }

    /**
     * Setter method for property <tt>password</tt>.
     *
     * @param password value to be assigned to property password
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
