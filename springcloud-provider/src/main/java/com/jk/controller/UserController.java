package com.jk.controller;

import com.jk.model.UserModel;
import com.jk.service.UserServer;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController implements UserServer {

    @Autowired
    private UserService userService;

    @GetMapping("test")
    @Override
    public void test(String userName) {

        System.out.println("接收成功get"+userName);
    }

    @PostMapping("test")
    @Override
    public void test2(String userName) {

        System.out.println("接收成功post"+userName);
    }

    @GetMapping("login")
    @Override
    public UserModel userlogin(String userName) {


        return userService.userlogin(userName);
    }


}
