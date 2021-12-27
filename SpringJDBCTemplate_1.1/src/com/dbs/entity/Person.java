package com.dbs.entity;
        import org.springframework.jdbc.datasource.DriverManagerDataSource;
        import lombok.AllArgsConstructor;
        import lombok.Data;
        import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    int id;
    String name;
    double salary;

}
