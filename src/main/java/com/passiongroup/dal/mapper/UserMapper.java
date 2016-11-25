/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved/
 */
package com.passiongroup.dal.mapper;

import com.passiongroup.dal.model.UserDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 *
 * @author Finderhu
 * @version $Id: UserMapper.java, V 0.1 2016-11-22 22:13 Finderhu Exp $
 */
@Mapper
public interface UserMapper {
    @Select("select * from User where username = #{username}")
    public UserDO findUserByUsername(@Param("username") String userName);

    @Select("select password from User where username = #{username}")
    public String findPasswordByUsername(@Param("username") String userName);
}
