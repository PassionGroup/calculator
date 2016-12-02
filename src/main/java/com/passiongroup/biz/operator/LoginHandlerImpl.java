package com.passiongroup.biz.operator;

import com.passiongroup.biz.model.User;
import com.passiongroup.biz.operator.RegisterHandler;
import com.passiongroup.dal.mapper.UserMapper;
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
public class LoginHandlerImpl extends LoginHandler {
    private static final Logger LOGGER = Logger.getLogger(com.passiongroup.biz.operator.LoginHandlerImpl.class);

    @Autowired
    private UserMapper userMapper;
    private UserRepository userRepository;
    private User user;
    Result result = new Result(false,null,null);
    String password = userMapper.findPasswordByUsername("finder");
    if(userRepository.addUser("finder").StringUtils.equals(user.getName())){
        if(password.StringUtils.equals(user.getPassword())){
            result.setSuccess(true);
        }
        else{
            LOGGER.warn("参数校验不通过");
            result.setErrorCode(-1);
        }
    }
    if(!userRepository.addUser("finder").StringUtils.equals(user.getName())){
        if(userRepository.isEmailExist.StringUtils.equals(user.getEmail())){
            if(password.StringUtils.equals(user.getPassword())){
                result.setSuccess(true);
            }
            else{
                LOGGER.warn("参数校验不通过");
                result.setErrorCode(-1);
            }
        }
        else {

                LOGGER.error(user.getMessage());
                result.setErrorCode(-4);
        }
    }
}
