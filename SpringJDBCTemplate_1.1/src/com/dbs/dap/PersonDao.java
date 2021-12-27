package com.dbs.dap;

import com.dbs.entity.Person;
import com.dbs.entity.PersonRowMapper;
import com.dbs.exception.InvalidPersonIdException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.sql.Types;
import java.util.List;

@Component
public class PersonDao {

    JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }
    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Person find(int id)throws InvalidPersonIdException {

        String sql = "select * from person where id=?";
        Person person =jdbcTemplate.queryForObject(sql,new Object[] {id} , new PersonRowMapper());
        if(person==null){
            throw new InvalidPersonIdException("Person id is not valid: "+id);
        }
        return person;
    }

    public List<Person> findAll(){

        String sql = "select * from person";
        List<Person> persons =jdbcTemplate.query(sql, new PersonRowMapper());
        return jdbcTemplate.query(sql, new PersonRowMapper());
    }

    public boolean save(Person person){

        String sql = "insert into person values("+person.getId()+",'"+person.getName()+"',"+person.getSalary()+")";
        if(jdbcTemplate.update(sql)==1){
//            System.out.println("Sucessfully Inserted!");
            return true;
        }
        else {
//            System.out.println("Inserted failed");
            return false;
        }
//        return false;
    }

    public boolean edit(Person person){

        String sql="update person set name=?,salary=? where id=?";
        int norecords=jdbcTemplate.update(sql,new Object[] {person.getName(),person.getSalary(),person.getId()},new int[] {Types.VARCHAR,Types.DOUBLE,Types.INTEGER});
        if(norecords==1)
        {
            return true;

        }
        else {
            return false;
        }

//        return false;
    }

    public boolean delete(int id){

        String sql="delete person where id=?";



        if(jdbcTemplate.update(sql, new Object[] {id})==1)
        {
            return true;

        }
        else {
            return false;
        }


    }


}
