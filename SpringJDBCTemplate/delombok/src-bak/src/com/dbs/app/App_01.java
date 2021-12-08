package com.dbs.app;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import com.dbs.entity.Person;
public class App_01 {
    public static void main(String args[])
    {
        ApplicationContext ctxt=new ClassPathXmlApplicationContext("spring.xml");
        JdbcTemplate jdbcTemplate=ctxt.getBean(JdbcTemplate.class);
        Person person=new Person(102,"Shiva",2000);
        String sql="insert into person values("+person.getId()+","+person.getName()+" ,"+person.getSalary()+")";
        if(jdbcTemplate.update(sql)==1) {
            System.out.println("Inserted sucesssfully");
            System.out.println();
        }
        else
        {
            System.out.println("Insertion Failed");
        }
    }

}