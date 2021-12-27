package com.dbs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.entity.Employee;
import com.dbs.exception.InvalidDepartmentIdException;
import com.dbs.exception.InvalidEmployeeIdException;
import com.dbs.repo.EmployeeRepo;

@Service
public class EmployeeService {
    EmployeeRepo employeeRepo;
    DepartmentService departmentService;
    public EmployeeRepo getEmployeeRepo() {
        return employeeRepo;
    }

    @Autowired
    public void setEmployeeRepo(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }
    public DepartmentService getDepartmentService() {
        return departmentService;
    }
    @Autowired
    public void setDepartmentRepo(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }
    public Employee find(int id) throws InvalidEmployeeIdException {
        Optional<Employee> optionalEmp = employeeRepo.findById(id);
        if (!optionalEmp.isPresent()){
            throw new InvalidEmployeeIdException("Employeeid not found:"+id);
        }
        return optionalEmp.get();
    }

    public List<Employee> findAll() {
        return employeeRepo.findAll();
    }

    public Employee save(Employee employee) {
        return employeeRepo.save(employee);
    }
    public Employee update(Employee employee) throws InvalidEmployeeIdException {
        Optional<Employee> optionalEmp=employeeRepo.findById(employee.getId());
        if (optionalEmp.isPresent()) {
            return employeeRepo.save(employee);
        }
        throw new InvalidEmployeeIdException("Employee not existing to modify with id:"+employee.getId());

    }
    public Employee delete(int id) throws InvalidEmployeeIdException {
        Optional<Employee> optionalEmp=employeeRepo.findById(id);
        if (optionalEmp.isPresent()) {
            Employee employee = optionalEmp.get();
            employeeRepo.deleteById(id);
            return employeeRepo.save(employee);
        } else {
            throw new InvalidEmployeeIdException("Employee not existing to delete with id:" + id);

        }
    }
    public List<Employee> findAllByDeptId(int deptId) throws InvalidDepartmentIdException{
        departmentService.find(deptId);
        return employeeRepo.findAllByDept(deptId);
    }
}