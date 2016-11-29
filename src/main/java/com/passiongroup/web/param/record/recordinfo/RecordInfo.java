/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved/
 */
package com.passiongroup.web.param.record.recordinfo;

import java.util.Date;

/**
 *
 * @author Finderhu
 * @version $Id: RecordInfo.java, V 0.1 2016-10-31 18:54 Finderhu Exp $
 */
public class RecordInfo {
    // TODO: 2016/10/31 @李小虎

    private Date time;
    private String username;

    public  RecordInfo(){
    }

    public  RecordInfo(Date time, String username){
        this.time=time;
        this.username=username;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
