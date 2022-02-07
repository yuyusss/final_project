package com.project.mutroduce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.annotation.RequestScope;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
}