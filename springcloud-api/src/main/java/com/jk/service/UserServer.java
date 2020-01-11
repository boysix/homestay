package com.jk.service;

import com.jk.model.UserModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface UserServer {

    @GetMapping("user/test")
    void test(@RequestParam("userName") String userName);

    @PostMapping("user/test")
    void test2(@RequestParam("userName") String userName);

    @GetMapping("user/login")
    UserModel userlogin(@RequestParam("userName") String userName);
}
