package com.mybatis.test.service;

import com.mybatis.test.dao.SysPermissionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @Author sgl
 * @Date 2018-06-11 17:10
 */
@Service
public class SysPermissionService {
    @Autowired
    private SysPermissionDao sysPermissionDao;

    public List<String> selectPermissionByUserId(long userId) {
        return sysPermissionDao.selectPermissionByUserId(userId);
    }
}
