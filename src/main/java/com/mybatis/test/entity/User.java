package com.mybatis.test.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Description
 * @Author sgl
 * @Date 2018-05-02 14:59
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User implements Serializable {
    private Long userId;
    private String userName;
    private Integer userAge;

}
