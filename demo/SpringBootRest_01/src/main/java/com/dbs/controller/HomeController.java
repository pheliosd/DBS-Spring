package com.dbs.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
public class HomeController {
    @ResponseBody
    @RequestMapping("/hello/{name}/{tech}")
    public String sayHello(String name,String tech) {
//        System.out.println("Inside of sayhello "+name+","+tech);
        return "Hello"+name+", hope you are enjoying"+tech ;
    }
}
