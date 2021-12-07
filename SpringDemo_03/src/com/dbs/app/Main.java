package com.dbs.app;

import com.dbs.list.ListClass;
import com.dbs.map.MapClass;
import com.dbs.set.SetClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import lombok.*;
//import java.util.List;

public class Main {


    public static void main(String[] args) {
	ApplicationContext ctxt = new ClassPathXmlApplicationContext("spring.xml");
        ListClass listClass =(ListClass) ctxt.getBean("listClass");
        SetClass setclass = (SetClass) ctxt.getBean("setclass");
        MapClass mapclass = (MapClass)ctxt.getBean("mapclass");


        System.out.println("BooksList: "+listClass.getBooks());
        System.out.println("CitiesList: " + setclass.getCities());
        System.out.println("Employability: "+ mapclass.getEmployee());
    }

}
