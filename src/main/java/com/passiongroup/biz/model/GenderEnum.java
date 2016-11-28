/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved/
 */
package com.passiongroup.biz.model;

import org.springframework.util.StringUtils;

/**
 *
 * @author Finderhu
 * @version $Id: GenderEnum.java, V 0.1 2016-10-31 19:02 Finderhu Exp $
 */
public enum GenderEnum {
        MAN(0, "男"),
        WOMAN(1, "女"),
        UNKNOWN(2, "不确定");

        private Integer code;
        private String description;

        GenderEnum(Integer code, String description) {
                this.code = code;
                this.description = description;
        }

        public Integer getCode() {
                return code;
        }

        public String getDescription() {
                return description;
        }

        public static GenderEnum getGenderEnumByCode(String genderCode){
            /**去掉genderCode中可能包含的空格*/
            String trimmedGenderCode = StringUtils.trimAllWhitespace(genderCode);
            GenderEnum result = null;
            for (GenderEnum gender : GenderEnum.values()) {
                    if(gender.getCode().equals(trimmedGenderCode)){
                            result = gender;
                    }
            }
            return result;
        }
}

