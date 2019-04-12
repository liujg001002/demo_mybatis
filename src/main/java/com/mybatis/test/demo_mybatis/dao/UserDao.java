package com.mybatis.test.demo_mybatis.dao;

import com.mybatis.test.demo_mybatis.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author liujianguo
 * @data 2019/4/1
 * 描述：
 */
public interface UserDao {

    List<User> query();
    User findById(Integer id);
    boolean insert(User user);
    boolean update(User user);
    boolean delete(Integer id);
    List<User> queryByIds(List<Integer> list);
    boolean updateByCondition(User user);
    List<User> queryUserAndRole();
    List<User> queryOrFindById(@Param("id") Integer id);
    List<User> queryUserHaveInfo();
}
