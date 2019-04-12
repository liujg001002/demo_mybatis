package com.mybatis.test.demo_mybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author liujianguo
 * @data 2019/4/2
 * 描述：
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Role implements Serializable{

    private static final long serialVersionUID = -3275136715336990496L;
    private Integer id;
    private String roleName;

}
