package com.dbs.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        ApplicationContext ctxt = new ClassPathXmlApplicationContext("spring.xml");
        ApplicationContext abc = new ClassPathXmlApplicationContext("spring.xml");
        Point  pa = (Point)abc.getBean("pa");
        System.out.println(pa);

    }
}
