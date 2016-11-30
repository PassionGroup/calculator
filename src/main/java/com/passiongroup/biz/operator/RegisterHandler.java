package com.passiongroup.biz.operator;

import com.passiongroup.biz.model.User;
import com.passiongroup.util.CCException;
import com.passiongroup.util.Result;

/**
 * Created by longhuai.hlh on 2016/11/30.
 */
public interface RegisterHandler {
    public Result register(User user) throws CCException;
}
