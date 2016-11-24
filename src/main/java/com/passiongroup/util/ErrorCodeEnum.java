package com.passiongroup.util;

/**
 * Created by longhuai.hlh on 2016/11/24.
 */
public enum ErrorCodeEnum {
    UPDATE_USER_STATE_ERROR("update user {0}'s state error"),
    GET_NO_PASSWORD("user {0} is not register yet")
    ;

    private String description;

    ErrorCodeEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
