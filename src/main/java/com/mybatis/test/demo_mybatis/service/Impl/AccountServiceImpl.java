package com.mybatis.test.demo_mybatis.service.Impl;

import com.mybatis.test.demo_mybatis.dao.AccountDao;
import com.mybatis.test.demo_mybatis.entity.Account;
import com.mybatis.test.demo_mybatis.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liujianguo
 * @data 2019/4/16
 * 描述：
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountDao accountDao;
    @Override
    public Account findById(Integer id) {
        return accountDao.findById(id);
    }

    @Override
    public Account findByLoginName(String loginName) {
        return accountDao.findByLoginName(loginName);
    }

    @Override
    public Boolean deleteById(Integer id) {
        return accountDao.deleteById(id);
    }
}
