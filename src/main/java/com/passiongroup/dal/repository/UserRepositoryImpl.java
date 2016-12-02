package com.passiongroup.dal.repository;

import com.passiongroup.biz.model.User;
import com.passiongroup.dal.mapper.UserMapper;
import com.passiongroup.util.CCException;
import com.passiongroup.util.ErrorCodeEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * Created by longhuai.hlh on 2016/11/24.
 */
@Component
public class UserRepositoryImpl implements UserRepository {
    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private UserMapper userMapper;

    @Override
    public String getPassword(String userInfo) throws CCException {
        String password = userMapper.findPasswordByUsername(userInfo);
        if(StringUtils.isEmpty(password)){
            throw new CCException(ErrorCodeEnum.GET_NO_PASSWORD, userInfo);
        }
        return password;
    }

    @Override
    public void updateUserState(User user) throws CCException {

    }

    @Override
    public boolean isUserNameExist(String userName) {
        return false;
    }

    @Override
    public boolean isEmailExist(String email) {
        return false;
    }

    @Override
    public void addUser(User user) throws CCException {

    }
}
