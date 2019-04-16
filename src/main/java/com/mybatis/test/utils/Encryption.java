package com.mybatis.test.utils;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

/**
 * @author liujianguo
 * @data 2019/4/16
 * 描述：加密类
 */
public class Encryption {

    /***
     * MD5加密
     * @author liujianguo
     * @date 2019/4/16 16:25
     * @param  var 值
     * @param  hashIterations 加密次数
     * @param  salt 盐值
     * @return java.lang.String
     */
    public static String MD5Encryption(String var,Integer hashIterations,Object salt){
        ByteSource byteSource = ByteSource.Util.bytes(salt);
        return new SimpleHash("MD5", var, byteSource, hashIterations).toString();
    }
}
