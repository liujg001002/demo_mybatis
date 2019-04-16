package com.mybatis.test.dao;

import com.mybatis.test.entity.Account;

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
