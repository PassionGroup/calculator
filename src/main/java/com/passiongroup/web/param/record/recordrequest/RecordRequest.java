/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved/
 */
package com.passiongroup.web.param.record.recordrequest;

/**
 *
 * @author Finderhu
 * @version $Id: RecordRequest.java, V 0.1 2016-10-31 18:56 Finderhu Exp $
 */
public class RecordRequest {
    // TODO: 2016/10/31 @李小虎

    private String startIndex;
    private String endIndex;

    public RecordRequest(){
    }

    public RecordRequest(String startIndex, String endIndex){
        this.startIndex=startIndex;
        this.endIndex=endIndex;
    }

    public String getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(String startIndex) {
        this.startIndex = startIndex;
    }

    public String getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(String endIndex) {
        this.endIndex = endIndex;
    }

}
