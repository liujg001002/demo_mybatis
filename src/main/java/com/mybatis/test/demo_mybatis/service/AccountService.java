package com.mybatis.test.demo_mybatis.service;

import com.mybatis.test.demo_mybatis.entity.Account;

/**
 * @author liujianguo
 * @data 2019/4/16
 * 描述：
 */
public interface AccountService {
    Account findById(Integer id);
    Account findByLoginName(String loginName);
    Boolean deleteById(Integer id);
}
