package com.passiongroup.util;

import com.passiongroup.biz.model.User;
import com.passiongroup.web.param.account.UserInfo;

/**
 * Created by longhuai.hlh on 2016/11/24.
 */
public class UserParamConveter {
    static User convertToUser(UserInfo userInfo) {
        // TODO: 2016/11/24 石丰华
        userInfo=new UserInfo("bob","男",  new Integer(18),"123@qq.com","321");
        String gender=userInfo.getGender();
        public enum GenderEnums {
            MAN(0, "男"),
            WOMAN(1, "女"),
            UNKNOWN(3, "不确定");

            private final Integer code;
            private final String description;

            GenderEnums(Integer code, String description) {
                this.code = code;
                this.description = description;
            }
           public GenderEnums toEnum(String gender){
                return GenderEnums.valueOf( gender);
            }

        }
        return null;
    }
}
