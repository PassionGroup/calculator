package com.passiongroup.dal.repository;

import com.passiongroup.dal.mapper.UserMapper;
import com.passiongroup.dal.model.UserDO;
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
    @Autowired
    private UserMapper userMapper;

    @Override
    public String getPassword(String userName) throws CCException {
        String password = userMapper.findPasswordByUsername(userName);
        if(StringUtils.isEmpty(password)){
            throw new CCException(ErrorCodeEnum.GET_NO_PASSWORD,userName);
        }
        return password;
    }

    @Override
    public void updateUserState(UserDO userDO) throws CCException {

    }
}