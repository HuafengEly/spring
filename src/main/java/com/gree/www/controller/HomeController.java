package com.gree.www.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

    @RequestMapping("/homeIndex")
    public String homeIndex(){
        return "homeIndex";
    }

}
