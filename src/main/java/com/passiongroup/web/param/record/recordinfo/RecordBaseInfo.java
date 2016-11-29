/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved/
 */
package com.passiongroup.web.param.record.recordinfo;

/**
 *
 * @author Finderhu
 * @version $Id: RecordBaseInfo.java, V 0.1 2016-10-31 18:49 Finderhu Exp $
 */
public class RecordBaseInfo {
    // TODO: 2016/10/31 @李小虎

    private String equation;
    private double result;

    public RecordBaseInfo(){
    }

    public RecordBaseInfo(String equation, double result){
        this.equation=equation;
        this.result=result;
    }


    public String getEquation() {
        return equation;
    }

    public void setEquation(String equation) {
        this.equation = equation;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

}
