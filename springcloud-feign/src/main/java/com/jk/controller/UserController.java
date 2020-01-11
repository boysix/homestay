package com.jk.controller;

import com.jk.model.UserModel;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("test")
    public void test(String userName){

        userService.test(userName);
        System.out.println(userName+"---------get-----");
    }

    @PostMapping("test")
    public void test2(String userName){

        userService.test2(userName);

        System.out.println(userName+"---------post-----");
    }


    @GetMapping("login")
    public String login(String userName , String userPasw, HttpServletRequest request){

        UserModel user = userService.userlogin(userName);

        //验证用户名
        if(user==null){
            return "用户名不存在！";
        }
        //验证密码
        if(!userPasw.equals(user.getUserPasw())){
            return "密码错误！";
        }
        request.getSession().setAttribute("user",user);
        return "登录成功！";
    }






}
