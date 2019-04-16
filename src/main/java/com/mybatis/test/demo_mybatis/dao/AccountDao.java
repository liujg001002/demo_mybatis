package com.mybatis.test.demo_mybatis.dao;

import com.mybatis.test.demo_mybatis.entity.Account;

/**
 * @author liujianguo
 * @data 2019/4/16
 * 描述：
 */
public interface AccountDao {

    Account findById(Integer id);
    Account findByLoginName(String loginName);
    Boolean deleteById(Integer id);
}
