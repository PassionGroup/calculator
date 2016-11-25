/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved/
 */
package com.passiongroup.biz.model;

/**
 *
 * @author Finderhu
 * @version $Id: GenderEnums.java, V 0.1 2016-10-31 19:02 Finderhu Exp $
 */
public enum GenderEnums {
// TODO: 2016/10/31 @石丰华

        MAN(0, "男"),
        WOMAN(1, "女"),
        UNKNOWN(3, "不确定");

        private Integer code;
        private String description;

        GenderEnums(Integer code, String description) {
                this.code = code;
                this.description = description;
        }
}

/**public enum Gender {男,女,String value=null}

public void GetGender(){
        return gender;
        }
public void SetGender(Sring gender){
        this.gender=gender;
        }


public class Description{
    public static void main(String args[]){

        Gender gender=Gender.男
        public String Description(){
            switch(gender){
                case 男:
                    System.out.println("性别："gender) ;
                    Gender gender=Gender.女;
                    break;
                case 女:
                    System.out.println("性别："gender) ;
                    Gender gender=value;
                    break;
                case value:
                    System.out.println("性别："gender) ;
                    break;
            }
        }

    }
}

}*/
