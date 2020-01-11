package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("kz")
public class PageController {


    /**
     * @return   去 登陆页面
     */
    @RequestMapping("login")
    public String login(){

        return "Userlogin/login";
    }

    /**
     * @return   去 注册 页面
     */
    @RequestMapping("zhuche")
    public String zhuche(){

        return "Userlogin/zhuche";
    }

    /**
     * @return   去 登陆页面
     */
    @RequestMapping("MinShuShouYe")
    public String MinShuShouYe(){

        return "MinShuYeMian/shouye";
    }

    @RequestMapping("test")
    public String test(){

        return "text";
    }

    /*主页*/
    @RequestMapping("index")
    public String home(){

        return "home/index";
    }

    /*新闻*/
    @RequestMapping("news")
    public String news(){

        return "home/news";
    }

    /*contact	联系我们*/
    @RequestMapping("contact")
    public String contact(){

        return "home/contact";
    }
    /*rooms	客房*/

    @RequestMapping("rooms")
    public String rooms(){

        return "home/rooms";
    }

    /*single	单页*/
    @RequestMapping("single")
    public String single(){

        return "home/single";
    }

    /*gallery	画廊*/
    @RequestMapping("gallery")
    public String gallery(){

        return "home/gallery";
    }

    /*register	注册*/
    @RequestMapping("register")
    public String register(){

        return "home/register";
    }

    /*updatePassword	忘记密码*/
    @RequestMapping("updatePassword")
    public String updatePassword(){

        return "home/updatePassword";
    }



}
