/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved/
 */
package com.passiongroup.biz.operator;

import com.passiongroup.biz.model.User;
import com.passiongroup.dal.repository.UserRepository;
import com.passiongroup.util.CCException;
import com.passiongroup.util.Result;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 *
 * @author Finderhu
 * @version $Id: RegisterHandler.java, V 0.1 2016-11-29 23:02 Finderhu Exp $
 */
@Service
public class RegisterHandler {
    private static final Logger LOGGER = Logger.getLogger(RegisterHandler.class);

    @Autowired
    private UserRepository userRepository;

    public Result register(User user) {
        Result result = new Result(false,null,null);
        if(!registerParamCheck(user)){
            LOGGER.warn("参数校验不通过");
            result.setErrorCode(-1);
            return result;
        }
        if(userRepository.isUserNameExist(user.getName())){
            LOGGER.error("用户名已经存在");
            result.setErrorCode(-2);
            return result;
        }
        if(userRepository.isEmailExist(user.getEmail())){
            LOGGER.error("邮箱已经被使用");
            result.setErrorCode(-3);
        }
        try{
            userRepository.addUser(user);
            result.setSuccess(true);
            result.setResultObject(user.getName());
            return result;
        }catch (CCException e){
            LOGGER.error(e.getMessage());
            result.setErrorCode(-4);
            return result;
        }
    }

    private boolean registerParamCheck(User user){
        if(user == null){
            return false;
        }
        if(!StringUtils.hasText(user.getName()) ||
                !StringUtils.hasText(user.getEmail()) ||
                !StringUtils.hasText(user.getPassword())){
            return false;
        }
        return true;
    }

    /**
     * Setter method for property <tt>userRepository</tt>.
     *
     * @param userRepository value to be assigned to property userRepository
     */
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
