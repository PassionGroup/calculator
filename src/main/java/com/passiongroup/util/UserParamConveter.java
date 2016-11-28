package com.passiongroup.util;

import com.passiongroup.biz.model.GenderEnum;
import com.passiongroup.biz.model.User;
import com.passiongroup.web.param.account.UserInfo;

/**
 * Created by longhuai.hlh on 2016/11/24.
 */
public class UserParamConveter {
    static User convertToUser(UserInfo userInfo) {
        if(userInfo == null){
            return null;
        }
        User user = new User();
        user.setName(userInfo.getName());
        user.setPassword(userInfo.getPassword());
        user.setAge(userInfo.getAge());
        user.setEmail(userInfo.getEmail());
        GenderEnum genderEnum = GenderEnum.getGenderEnumByCode(userInfo.getGender());
        if(genderEnum != null){
            user.setGender(genderEnum);
        }
        return user;
    }
}
