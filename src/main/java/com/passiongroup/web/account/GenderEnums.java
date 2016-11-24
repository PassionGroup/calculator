/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved/
 */
package com.passiongroup.web.account;

/**
 *
 * @author Finderhu
 * @version $Id: GenderEnums.java, V 0.1 2016-10-31 19:02 Finderhu Exp $
 */
public enum GenderEnums {
// TODO: 2016/10/31 @石丰华
private Integer code=new Integer();
public enum Gender {男,女,String value=null}

public void GetGender(){
        return gender;
        }
public void SetGender(Sring gender){
        this.gender=gender;
        }

public String Value (String v){
        value=v;
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

}
