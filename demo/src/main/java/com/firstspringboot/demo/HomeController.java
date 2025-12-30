package com.firstspringboot.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Value("${}")
    private String appName;

    @RequestMapping("/")
    public String index(){
        String viewName = getViewName();
        return viewName;
    }

    private String getViewName(){

        System.out.println("App Name:"+appName);
        return "index.html";
    }
}
