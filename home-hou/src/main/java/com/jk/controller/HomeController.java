package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("zqx")
public class HomeController {

    /*主页*/
    @RequestMapping("home")
    public String toHome (Integer userid){

        return "home/userShow";
    }

    /*个人中心*/
    @RequestMapping("tohomesy")
    public String tohome (Integer userID){

        return "home/home_SY";
    }

    /*评论管理*/
    @RequestMapping("homeplgl")
    public String tohomePLGL (){

        return "home/home_PLGL";
    }

    /*我的消息*/
    @RequestMapping("homeimxx")
    public String tohomeIMXX (){
        return "home/home_IMXX";
    }

    /*安全信息*/
    @RequestMapping("homeinfo")
    public String tohomeinfo (){
        return "home/home_info";
    }

    /*邮件页面*/
    @RequestMapping("homeemail")
    public String tohomeemail (){
        return "home/home_email";
    }


}
