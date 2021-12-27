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
	
	@Autowired
	EmployeeRepo employeeRepo;
	@Autowired
	DepartmentService departmentService;

	public EmployeeRepo getEmployeeRepo() {
		return employeeRepo;
	}
//	@Autowired
	public void setEmployeeRepo(EmployeeRepo employeeRepo) {
		this.employeeRepo = employeeRepo;
	}
	public DepartmentService getDepartmentService() {
		return departmentService;
	}
//	@Autowired
	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}
	public Employee find(int id) throws InvalidEmployeeIdException {
        Optional<Employee> employee = employeeRepo.findById(id);
        if(!employee.isPresent()) {
            throw new InvalidEmployeeIdException("Employee not found with id - " + id);
        }
        return employee.get();
    }

    public List<Employee> findAll() {
        return employeeRepo.findAll();
    }

    public Employee save(Employee employee) {
        return employeeRepo.save(employee);
    }

    public Employee update(Employee employee) throws InvalidEmployeeIdException {
        Optional<Employee> optEmployee = employeeRepo.findById(employee.getId());
        if(optEmployee.isEmpty()) {
        	throw new InvalidEmployeeIdException("Employee not existing with id :" + employee.getId());
        }      
        return employeeRepo.save(employee);
    }

    public Employee delete(int id) throws InvalidEmployeeIdException {
    	Optional<Employee> optEmployee = employeeRepo.findById(id);
        if(optEmployee.isEmpty()) {
        	throw new InvalidEmployeeIdException("Employee not existing with id : " + id);
        }
        Employee employee = optEmployee.get();
        employeeRepo.delete(employee);
        return employee;
    }
    
    public List<Employee> findAllByDeptId(int deptId) throws InvalidDepartmentIdException {
    	departmentService.find(deptId);
    	return employeeRepo.findAllByDept(deptId);
		
	}
    
    

	
	

}
