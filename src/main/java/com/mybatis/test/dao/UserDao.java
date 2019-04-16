package com.mybatis.test.dao;

import com.mybatis.test.entity.User;
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
