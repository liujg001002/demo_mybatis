package com.mybatis.test.entity;

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
public class SysUser {

    private Integer userId;
    private String userName;
    private String fullName;
    private String password;
    private String salt;
}
