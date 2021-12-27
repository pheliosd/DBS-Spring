package com.dbs;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.dbs.entity.Department;
import com.dbs.entity.Employee;
import com.dbs.exception.InvalidDepartmentIdException;
import com.dbs.exception.InvalidEmployeeIdException;
import com.dbs.service.DepartmentService;
import com.dbs.service.EmployeeService;

@SpringBootApplication
@ComponentScan({ "com.dbs.*" })
public class SpringBootJpaApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(SpringBootJpaApplication.class, args);
	
		DepartmentService departmentService = ctxt.getBean(DepartmentService.class);
		EmployeeService employeeService = ctxt.getBean(EmployeeService.class);
		
//		Department department1 = new Department("Tech");
//		Department department2 = new Department("Creative");
//		
//		Employee employee1 = new Employee("Alex");
//		Employee employee2 = new Employee("James");
//		Employee employee3 = new Employee("Raj");
//		Employee employee4 = new Employee("Ramesh");
//		
//		List<Employee> employeeList1 = new ArrayList<>();
//		employeeList1.add(employee1);
//		employeeList1.add(employee2);
//		
//		List<Employee> employeeList2 = new ArrayList<>();
//		employeeList2.add(employee3);
//		employeeList2.add(employee4);
//		
//		department1.setEmployees(employeeList1);
//		department2.setEmployees(employeeList2);
//		
//		employee1.setDepartment(department1);
//		employee2.setDepartment(department1);
//		employee3.setDepartment(department2);
//		employee4.setDepartment(department2);
//		
//		departmentService.save(department1);
//		departmentService.save(department2);
//		
//		employeeService.save(employee1);
//		employeeService.save(employee2);
//		employeeService.save(employee3);
//		employeeService.save(employee4);	
		
		
//		try {
//            Department department = departmentService.find(2);
//            System.out.println(department);
//            List<Employee> empsInDept1 = employeeService.findAllByDeptId(2);
//            for(Employee employee : empsInDept1) {
//                System.out.println(employee);
//            }
//            
//            
//        } catch (InvalidDepartmentIdException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
		
//		Department department3 = new Department("Try");
//		Employee emp1 = new Employee("Abc");
//		Employee emp2 = new Employee("Xyz");
//		
//		List<Employee> empList = new ArrayList<>();
//		empList.add(emp2); empList.add(emp1);
//		department3.setEmployees(empList);
//		emp1.setDepartment(department3); emp2.setDepartment(department3);
//		
//		departmentService.save(department3);
//		employeeService.save(emp2); employeeService.save(emp1);
		
//		try {
//			departmentService.delete(4);
//		} catch (InvalidDepartmentIdException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		try {
//			employeeService.delete(6);
//		} catch (InvalidEmployeeIdException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		Employee employee = null;
		try {
			employee = employeeService.find(3);
		} catch (InvalidEmployeeIdException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		employee.setName("Rajesh");
		employeeService.save(employee);
		
		
		
		
	}

}
