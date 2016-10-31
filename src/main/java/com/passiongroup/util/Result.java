/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved/
 */
package com.passiongroup.util;

/**
 *  该类作为结果包装类，主要是用来包装返回的结果，包括标志处理成功与否、错误代码等。
 * @author Finderhu
 * @version $Id: Result.java, V 0.1 2016-10-31 18:35 Finderhu Exp $
 */
public class Result {

    /**标志是否成功*/
    private Boolean success;

    /**错误代码*/
    private Integer errorCode;

    /**结果*/
    private Object resultObject;

    public Result() {
    }

    public Result(Boolean success, Integer errorCode, Object resultObject) {
        this.success = success;
        this.errorCode = errorCode;
        this.resultObject = resultObject;
    }

    /**
     * Getter method for property <tt>success</tt>.
     *
     * @return property value of success
     */

    public Boolean getSuccess() {
        return success;
    }

    /**
     * Setter method for property <tt>success</tt>.
     *
     * @param success value to be assigned to property success
     */
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    /**
     * Getter method for property <tt>errorCode</tt>.
     *
     * @return property value of errorCode
     */

    public Integer getErrorCode() {
        return errorCode;
    }

    /**
     * Setter method for property <tt>errorCode</tt>.
     *
     * @param errorCode value to be assigned to property errorCode
     */
    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Getter method for property <tt>resultObject</tt>.
     *
     * @return property value of resultObject
     */

    public Object getResultObject() {
        return resultObject;
    }

    /**
     * Setter method for property <tt>resultObject</tt>.
     *
     * @param resultObject value to be assigned to property resultObject
     */
    public void setResultObject(Object resultObject) {
        this.resultObject = resultObject;
    }
}
