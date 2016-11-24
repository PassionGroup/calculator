package com.passiongroup.web.account;

/**
 * Created by longhuai.hlh on 2016/11/24.
 */
public enum GenderEnumsExample {
    MAN(0,"男"),
    WOMAN(1,"女"),
    UNKNOWN(3,"不确定")
    ;
    private Integer code;
    private String description;

    GenderEnumsExample(Integer code, String description) {
        this.code = code;
        this.description = description;
    }
}
