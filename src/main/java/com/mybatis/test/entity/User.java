package com.mybatis.test.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @author liujianguo
 * @data 2019/4/1
 * 描述：用户信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {


    private static final long serialVersionUID = 2459813740366250650L;
    private Integer id;
    private String name;
    private Integer age;
    private List<Role> roles;
    private UserInfo userInfo;

    public User(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }


}
