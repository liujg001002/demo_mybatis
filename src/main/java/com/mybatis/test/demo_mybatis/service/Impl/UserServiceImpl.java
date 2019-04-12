package com.mybatis.test.demo_mybatis.service.Impl;

import com.mybatis.test.demo_mybatis.dao.UserDao;
import com.mybatis.test.demo_mybatis.entity.User;
import com.mybatis.test.demo_mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liujianguo
 * @data 2019/4/1
 * 描述：
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public List<User> query(){
        return userDao.query();

    }
    public User findById(Integer id){
        return userDao.findById(id);
    }

    @Override
    public boolean insert(User user) {
        return userDao.insert(user);
    }

    @Override
    public boolean update(User user) {
        return userDao.update(user);
    }

    @Override
    public boolean delete(Integer id) {
        return userDao.delete(id);
    }

    @Override
    public List<User> queryByIds(List<Integer> list) {
        return userDao.queryByIds(list);
    }
    public List<User> queryUserAndRole(){
        return  userDao.queryUserAndRole();
    }


}
