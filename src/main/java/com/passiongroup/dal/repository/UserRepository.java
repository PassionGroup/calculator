package com.passiongroup.dal.repository;

import com.passiongroup.biz.model.User;
import com.passiongroup.dal.model.UserDO;
import com.passiongroup.util.CCException;

/**
 * Created by longhuai.hlh on 2016/11/24.
 */
public interface UserRepository {
    public String getPassword(String userName);
    public void updateUserState(UserDO userDO) throws CCException;
    public boolean isUserNameExist(String userName);
    public boolean isEmailExist(String email);
    public void addUser(User user) throws CCException;
}
