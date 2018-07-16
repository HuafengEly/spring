package com.gree.www.controller;

import com.gree.www.dao.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MvcController {

    @RequestMapping(value="/welcome")
    public  String  hello(){
        return "hello";
    }

    @RequestMapping(value="/welcome_name")
    public  String  hello_name(String name){
        System.out.println("[Name!] : "+name);
        return "hello";
    }

    @RequestMapping(value="/welcome_param")
    public String hello_param(@RequestParam(value="username",required = false)String name){
        System.out.println("[Name!] : "+name);
        return "hello";
    }

    @RequestMapping("/welcome_model")
    public String hello_model(String name,Model model){
        System.out.println("[Name!] : "+name);
        model.addAttribute("username","zhangsan");
        return "hello";
    }

    @RequestMapping("/welcome_view")
    public ModelAndView hello_view(String name){
        ModelAndView view = new ModelAndView();
        User user = new User();
        user.setId(1);
        user.setName("wangwu");
        view.addObject("username",name);
        view.addObject("user",user);
        view.setViewName("hello");
        return  view;
    }


}