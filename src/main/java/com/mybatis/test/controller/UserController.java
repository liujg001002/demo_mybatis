package com.mybatis.test.controller;

import com.mybatis.test.entity.User;
import com.mybatis.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * @author liujianguo
 * @data 2019/4/1
 * 描述：
 */

@RequestMapping("/user")
//@RestController
@Controller
public class UserController {


    @Autowired
    UserService userService;


    @GetMapping("/getallusers")
    public String getAllUsers(Model model){

        model.addAttribute("list",userService.query());
        return "/user/list";
    }

    @GetMapping("/findbyid")
    @ResponseBody
    public User findById(Integer id){
        return userService.findById(id);
    }
    @PostMapping("/insert")
    public boolean insert(String name,Integer age){
        User user = new User(null,name,age);
        boolean flag =  userService.insert(user);
        return flag;
    }

    @GetMapping("/update")
    public boolean update(Integer id){
        return userService.update(new User(id,"update",12));
    }

    @GetMapping("/delete")
    public boolean delete(Integer id){
        return userService.delete(id);
    }

    @GetMapping("/querybyids")
    public List<User> queryByIds(Integer[] ids){
        List<Integer> list = Arrays.asList(ids);
        return userService.queryByIds(list);
    }

    @GetMapping({"/","/index"})
    public String index(){
       return "index";
    }
    @GetMapping("/jumpUserAdd")
    public String jumpUserAdd(){
        return "user/add";
    }
    @GetMapping("/jumpUserUpdate")
    public String jumpUserUpdate(Integer id){
        return "user/update";
    }


}
