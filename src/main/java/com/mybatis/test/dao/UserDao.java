package com.mybatis.test.dao;

import com.github.pagehelper.Page;
import com.mybatis.test.entity.User;


/**
 * @Description
 * @Author sgl
 * @Date 2018-05-02 15:02
 */
public interface UserDao {

    Page<User> getUsers();
    User selectByPrimaryKey(Long id);
}
