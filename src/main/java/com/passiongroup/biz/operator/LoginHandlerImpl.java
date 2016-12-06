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
public class LoginHandlerImpl implements LoginHandler {
    private static final Logger LOGGER = Logger.getLogger(LoginHandlerImpl.class);

    @Autowired
    private UserRepository userRepository;
   // private UserMapper userMapper;

    @Override
    public Result login(User user) throws CCException {
        Result result = new Result(false,null,null);
        /**输入参数校验*/
        if(!checkParam(user)){
            result.setErrorCode(-1);
            return result;
        }

        String userInfo = null;
        /**验证用户名*/
        if(StringUtils.hasText(user.getName())){
            //if user name is not exist then return.
            if(!userRepository.isUserNameExist(user.getName())){
                result.setErrorCode(-2);
                return result;
            }
            userInfo = user.getName();
        }

        /**验证电子邮箱*/
        //if email is not exist then return
        // FIXME: 2016/12/2 shifenghua
        else if( StringUtils.hasText(user.getEmail())){
            if(!userRepository.isEmailExist(user.getEmail())){
                result.setErrorCode(-2);
                return result;
            }
            userInfo = user.getEmail();
        }

        /**验证密码*/
        //if password is not correct then return
        String passwordInDatabase = userRepository.getPassword(userInfo);
        if(!passwordInDatabase.equals(user.getPassword())){
            result.setErrorCode(0);
            return result;
        }else {
            userRepository.updateUserState(user);
            result.setSuccess(true);
            user.setPassword("");
            result.setResultObject(user);
            return result;
        }
    }

    /**如果参数通过校验则返回true,否则返回false*/
    public boolean checkParam(User user) {
        // FIXME: 2016/12/2 shifenghua

        if(user == null){
            return false;
        }
        if(!StringUtils.hasText(user.getName()) &
                !StringUtils.hasText(user.getEmail())){
            return false;
        }
        if(StringUtils.hasText(user.getName()) ||
                StringUtils.hasText(user.getEmail())){
            if(!StringUtils.hasText(user.getPassword())){
                return false;
            }
            else{
                return true;
            }
        }
        return true;
    }
}
