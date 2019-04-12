package com.mybatis.test.demo_mybatis.service;

import com.mybatis.test.demo_mybatis.entity.User;

import java.util.List;

/**
 * @author liujianguo
 * @data 2019/4/1
 * 描述：
 */
public interface UserService {

   public List<User> query();
   public User findById(Integer id);
   public boolean insert(User user);
   public boolean update(User user);
   public boolean delete(Integer id);
   public List<User> queryByIds(List<Integer> list);
   List<User> queryUserAndRole();

}
