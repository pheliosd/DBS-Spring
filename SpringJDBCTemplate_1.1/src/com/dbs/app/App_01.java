package com.dbs.app;
import com.dbs.entity.PersonRowMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import com.dbs.entity.Person;

import java.util.List;

public class App_01 {
    public static void main(String args[])
    {
        ApplicationContext ctxt=new ClassPathXmlApplicationContext("spring.xml");
        JdbcTemplate jdbcTemplate=ctxt.getBean(JdbcTemplate.class);
        Person person=new Person(103,"Mahesh",3500);
        String sql="insert into person values("+person.getId()+", '"+person.getName()+"' ,"+person.getSalary()+")";
        System.out.println(sql);
        if(jdbcTemplate.update(sql)==1) {
            System.out.println("Inserted sucesssfully");
            System.out.println();
        }
//        else
//        {
//            System.out.println("Insertion Failed");
//        }
//        String sql = "select * from person";
//        List<Person> persons =jdbcTemplate.query(sql, new PersonRowMapper());
//        for(Person person: persons){
//            System.out.println(person);
//        }

    }

}