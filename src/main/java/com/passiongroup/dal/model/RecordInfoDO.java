/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved/
 */
package com.passiongroup.dal.model;

import java.util.Date;

/**
 *
 * @author Finderhu
 * @version $Id: RecordInfoDO.java, V 0.1 2016-11-22 22:29 Finderhu Exp $
 */
public class RecordInfoDO {
    private Date time;
    private String username;
    private String equation;
    private String result;

    public RecordInfoDO() {
    }

    public RecordInfoDO(Date time, String username, String equation, String result) {
        this.time = time;
        this.username = username;
        this.equation = equation;
        this.result = result;
    }

    /**
     * Getter method for property <tt>time</tt>.
     *
     * @return property value of time
     */

    public Date getTime() {
        return time;
    }

    /**
     * Setter method for property <tt>time</tt>.
     *
     * @param time value to be assigned to property time
     */
    public void setTime(Date time) {
        this.time = time;
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
     * Getter method for property <tt>equation</tt>.
     *
     * @return property value of equation
     */

    public String getEquation() {
        return equation;
    }

    /**
     * Setter method for property <tt>equation</tt>.
     *
     * @param equation value to be assigned to property equation
     */
    public void setEquation(String equation) {
        this.equation = equation;
    }

    /**
     * Getter method for property <tt>result</tt>.
     *
     * @return property value of result
     */

    public String getResult() {
        return result;
    }

    /**
     * Setter method for property <tt>result</tt>.
     *
     * @param result value to be assigned to property result
     */
    public void setResult(String result) {
        this.result = result;
    }
}

