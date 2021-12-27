package com.dbs.controller;


import org.springframework.web.bind.annotation.*;

public class HomeController {
    @ResponseBody
    @RequestMapping("/hello/{name}/{tech}")
    public String sayHello(@PathVariable String name, @PathVariable String tech) {
//        System.out.println("Inside of sayhello "+name+","+tech);
        return "Hello"+name+", hope you are enjoying"+tech ;
    }

    @ResponseBody
    @RequestMapping(value ="/hello", method= RequestMethod.POST)
    public String myPost(@RequestParam("n") String name, @RequestParam("t") String tech) {
        System.out.println("Inside of Post");
        return "Inside of post";
    }

    @ResponseBody
    @RequestMapping(value ="/hello", method= RequestMethod.PUT)
    public String myPut() {
        return "Inside of PUT";
    }
}
