/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved/
 */
package com.passiongroup.dal.mapper;

import com.passiongroup.dal.model.RecordInfoDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 *
 * @author Finderhu
 * @version $Id: RecordInfoMapper.java, V 0.1 2016-11-22 22:46 Finderhu Exp $
 */
@Mapper
public interface RecordInfoMapper {
    @Select("select * from RecordInfo where username=#{username}")
    public RecordInfoDO findRecordInfoByUsername(@Param("username") String username);
}
