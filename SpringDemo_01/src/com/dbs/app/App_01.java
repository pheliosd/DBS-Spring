package com.dbs.app;

import com.dbs.beans.Triangle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App_01 {
    public static void main(String[] args) {
        ApplicationContext ctxt = new ClassPathXmlApplicationContext("spring.xml");
        Triangle triangle = (Triangle)ctxt.getBean("triangle");
        System.out.println(triangle);
    }
}
