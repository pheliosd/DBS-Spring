package com.dbs.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/hai")
public class HaiController {
    @GetMapping
    public String sayHai() {
        return "Hai World";
    }
    @GetMapping("/hai/{name}")
    public String sayHai1(@PathVariable String name) {
        return "Hai"+name+"!!";
    }
}
