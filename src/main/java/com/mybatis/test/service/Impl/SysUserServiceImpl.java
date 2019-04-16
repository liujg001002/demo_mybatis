package com.mybatis.test.service.Impl;

import com.mybatis.test.dao.SysUserDao;
import com.mybatis.test.entity.SysUser;
import com.mybatis.test.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liujianguo
 * @data 2019/4/16
 * 描述：
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    SysUserDao sysUserDao;
    @Override
    public SysUser findById(Integer id) {
        return sysUserDao.findById(id);
    }

    @Override
    public SysUser findByUserName(String loginName) {
        return sysUserDao.findByUserName(loginName);
    }

    @Override
    public Boolean deleteById(Integer id) {
        return sysUserDao.deleteById(id);
    }
}
