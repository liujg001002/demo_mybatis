package com.mybatis.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author liujianguo
 * @data 2019/4/17
 * 描述：
 */
@Controller
public class UnAuthController {

    @GetMapping("/unauth")
    public String unauth(){
        return "unauth";
    }
}
