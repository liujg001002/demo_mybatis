package com.mybatis.test.demo_mybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author liujianguo
 * @data 2019/4/2
 * 描述：
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserInfo {

    private Integer id;
    private String idNum;
    private String sex;
}
