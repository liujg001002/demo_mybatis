package com.mybatis.test.service;

import com.mybatis.test.entity.SysUser;

/**
 * @author liujianguo
 * @data 2019/4/16
 * 描述：
 */
public interface SysUserService {
    SysUser findById(Integer id);
    SysUser findByUserName(String userName);
    Boolean deleteById(Integer id);
}
