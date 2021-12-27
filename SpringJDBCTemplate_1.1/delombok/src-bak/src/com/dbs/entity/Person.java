package com.dbs.entity;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    public Person(int i, String string, int j) {
        // TODO Auto-generated constructor stub
    }
    DriverManagerDataSource a;

    int id;
    String name;
    double salary;

}
