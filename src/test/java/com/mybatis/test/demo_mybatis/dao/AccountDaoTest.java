package com.mybatis.test.demo_mybatis.dao;

import com.mybatis.test.demo_mybatis.entity.Account;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author liujianguo
 * @data 2019/4/16
 * 描述：
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountDaoTest {

    @Autowired
    AccountDao accountDao;
    @Test
    public void findById() throws Exception {

        Account account = accountDao.findById(1);
        Assert.assertNotNull(account);
    }

    @Test
    public void findByLoginName() throws Exception {
        Account account = accountDao.findByLoginName("zs");
        Assert.assertNotNull(account);
    }

    @Test
    public void deleteById() throws Exception {
        Boolean flag = accountDao.deleteById(1);
        Assert.assertTrue(flag);
    }

}