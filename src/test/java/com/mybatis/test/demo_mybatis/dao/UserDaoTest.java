package com.mybatis.test.demo_mybatis.dao;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.mybatis.test.demo_mybatis.DemoMybatisApplication;
import com.mybatis.test.demo_mybatis.entity.User;
import com.mybatis.test.demo_mybatis.entity.UserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author liujianguo
 * @data 2019/4/1
 * 描述：
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes={DemoMybatisApplication.class})
public class UserDaoTest {



    @Autowired
    UserDao userDao;
    @Test
    public void updateByCondition() throws Exception {

        boolean flag = userDao.updateByCondition(new User(5,"test111",null));
        assertTrue(flag);
    }

    @Test
    public void queryUserAndRole() throws Exception {

        PageHelper.startPage(1, 2);
        //PageHelper.orderBy();
        List<User> list =  userDao.queryUserAndRole();
        Page page = (Page) list;
        PageHelper.clearPage();
        assertNotEquals(0,list.size());
    }

    @Test
    public void queryOrFindById() throws Exception {

        List<User> list1 = userDao.queryOrFindById(null);
        List<User> list2 = userDao.queryOrFindById(new Integer(1));

        assertNotEquals(0,list1.size());
        assertEquals(1,list2.size());
    }

    @Test
    public void queryUserHaveInfo() throws Exception {
        List<User> list = userDao.queryUserHaveInfo();
        UserInfo userInfo = list.get(0).getUserInfo();
        assertNotEquals(0,list.size());
    }

}