package com.dbs.controller;

import com.dbs.entity.Employee;
import com.dbs.exception.InvalidEmployeeIdException;
import com.dbs.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/Employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/")
    public List<Employee> findAll(){
        return employeeService.findAll();
    }

    @GetMapping("/{id}")
    public Employee find(@PathVariable int id) throws InvalidEmployeeIdException{
      Employee employee = employeeService.find(id);

        return  employeeService.find(id);
    }


}
