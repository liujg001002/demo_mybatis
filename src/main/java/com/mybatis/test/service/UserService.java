package com.mybatis.test.service;

import com.github.pagehelper.Page;
import com.mybatis.test.dao.UserDao;
import com.mybatis.test.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Author sgl
 * @Date 2018-05-02 15:01
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public Page<User> getUsers() {
        return userDao.getUsers();
    }

    public User selectById(long id){
        return userDao.selectByPrimaryKey(id);
    }
}
