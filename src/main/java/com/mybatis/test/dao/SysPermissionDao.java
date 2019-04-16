package com.mybatis.test.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description
 * @Author sgl
 * @Date 2018-06-11 17:21
 */
public interface SysPermissionDao {
    List<String> selectPermissionByUserId(@Param("userId") long userId);
}
