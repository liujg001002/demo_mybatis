package com.mybatis.test.demo_mybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author liujianguo
 * @data 2019/4/12
 * 描述：账户信息
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Account {

    private Integer id;
    private User user;
    private String loginName;
    private String password;
    private boolean enable;
}
