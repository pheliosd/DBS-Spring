package com.dbs.app;

import com.dbs.exception.InvalidPersonIdException;
import com.dbs.dap.PersonDao;
import com.dbs.entity.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App_02 {
    public static void main (String [] args) {
        ApplicationContext ctxt = new ClassPathXmlApplicationContext("spring.xml");
        PersonDao personDao = ctxt.getBean(PersonDao.class);
        Person p1 ;
        try{
            p1 = personDao.find(101);
            System.out.println(p1);
        }
        catch (InvalidPersonIdException e){
            e.printStackTrace();
        }










    }
}
