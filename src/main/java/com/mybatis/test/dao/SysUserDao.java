package com.mybatis.test.dao;

import com.mybatis.test.entity.SysUser;

/**
 * @author liujianguo
 * @data 2019/4/16
 * 描述：
 */
public interface SysUserDao {

    SysUser findById(Integer userId);
    SysUser findByUserName(String userName);
    Boolean deleteById(Integer userId);
}
