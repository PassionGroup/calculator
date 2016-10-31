/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved/
 */
package com.passiongroup.web.controller;

import com.passiongroup.util.Result;
import com.passiongroup.web.account.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Finderhu
 * @version $Id: AccountController.java, V 0.1 2016-10-31 18:59 Finderhu Exp $
 */
@Controller
@RequestMapping("/account/")
public class AccountController {

    @GetMapping("/login/")
    @ResponseBody
    public Result login(@RequestParam UserInfo userInfo){
        // TODO: 2016/10/31 完善业务逻辑 
        return new Result();
    }
}
