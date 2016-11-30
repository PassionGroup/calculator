package com.passiongroup.util;

import java.io.ObjectInput;
import java.io.Serializable;
import java.text.MessageFormat;

/**
 * Created by longhuai.hlh on 2016/11/24.
 */
public class CCException extends Exception {

    private static final long serialVersionUID = -2925249508606048271L;

    /**错误码*/
    private ErrorCodeEnum errorCodeEnum;

    public CCException() {
    }

    public CCException(Throwable cause, ErrorCodeEnum errorCodeEnum, Object... params) {
        super(MessageFormat.format(errorCodeEnum.getDescription(),params), cause);
        this.errorCodeEnum = errorCodeEnum;
    }
    public CCException(ErrorCodeEnum errorCodeEnum, Object... params){
        this(null,errorCodeEnum,params);
    }

    public ErrorCodeEnum getErrorCodeEnum() {
        return errorCodeEnum;
    }

    public void setErrorCodeEnum(ErrorCodeEnum errorCodeEnum) {
        this.errorCodeEnum = errorCodeEnum;
    }
}

