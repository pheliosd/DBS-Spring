package com.example.demo.repo;

//import com.dbs.entity.Employee;
import com.example.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	
	@Query("SELECT e FROM Employee e WHERE e.department.id = ?1")
	List<Employee> findAllByDept(int dept_id);

}
