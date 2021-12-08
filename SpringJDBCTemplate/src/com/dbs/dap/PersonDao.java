package com.dbs.dap;

import com.dbs.entity.Person;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class PersonDao {

    JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    public Person find(int id){
        return null;
    }

    public List<Person> findAll(){
        return null;
    }

    public boolean save(Person person){
        return false;
    }

    public boolean edit(Person person){
        return false;
    }

    public boolean delete(int id){
        return false;
    }


}
