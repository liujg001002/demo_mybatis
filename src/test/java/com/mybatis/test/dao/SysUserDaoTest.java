package com.mybatis.test.dao;

import com.mybatis.test.entity.SysUser;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author liujianguo
 * @data 2019/4/16
 * 描述：
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SysUserDaoTest {

    @Autowired
    SysUserDao sysUserDao;
    @Test
    public void findById() throws Exception {

        SysUser sysUser = sysUserDao.findById(1);
        Assert.assertNotNull(sysUser);
    }

    @Test
    public void findByUserName() throws Exception {
        SysUser sysUser = sysUserDao.findByUserName("zs");
        Assert.assertNotNull(sysUser);
    }

    @Test
    public void deleteById() throws Exception {
        Boolean flag = sysUserDao.deleteById(1);
        Assert.assertTrue(flag);
    }

}