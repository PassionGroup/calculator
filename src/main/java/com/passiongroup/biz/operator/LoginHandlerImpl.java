package com.passiongroup.biz.operator;

import com.passiongroup.biz.model.User;
import com.passiongroup.biz.operator.RegisterHandler;
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
    private UserRepository userRepository;
    private OperationOfUser operationOfUser;
    public Result login(User user) {
        Result result=new Result(false,null,null);
        if(result.getSuccess()){
            //userRepository.addUser(user);
            result.setSuccess(true);
            result.setResultObject(user.getName());
            operationOfUser.login();
            try {
                userRepository.getPassword(" finder ");
            } catch (CCException e) {
                e.printStackTrace();
            }
            return result;
        }
        if(userRepository.validatePassword("  ")){
            userRepository.updateUserState(User user);

        }



    return result;}
}
