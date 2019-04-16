package com.mybatis.test.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SysPermission implements Serializable {

    private Long id;
    private Long parentId;
    private String resName;
    private String resType;
    private String permission;
    private String url;
    private static final long serialVersionUID = 1L;

}