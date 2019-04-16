package com.mybatis.test.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author liujianguo
 * @data 2019/4/2
 * 描述：用户其他信息
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserInfo {

    private Integer id;
    private String idNum;
    private String sex;
}
