package com.dbs.service;

import com.dbs.entity.Department;
import com.dbs.exception.InvalidDepartmentIdException;
import com.dbs.repo.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {
	
	DepartmentRepo departmentRepo;
	
	public DepartmentRepo getDepartmentRepo() {
		return departmentRepo;
	}
	@Autowired
	public void setDepartmentRepo(DepartmentRepo departmentRepo) {
		this.departmentRepo = departmentRepo;
	}
	
	public Department find(int id) throws InvalidDepartmentIdException {
        Optional<Department> department = departmentRepo.findById(id);
        if(!department.isPresent()) {
            throw new InvalidDepartmentIdException("Department not found with id - " + id);
        }
        return department.get();
    }

    public List<Department> findAll() {
        return departmentRepo.findAll();
    }

    public Department save(Department department) {
        return departmentRepo.save(department);
    }

    public Department update(Department department) throws InvalidDepartmentIdException {
        Optional<Department> optDepartment = departmentRepo.findById(department.getId());
        department.getId();
        if (optDepartment.isPresent()) {
            return departmentRepo.save(department);
        }
        throw new InvalidDepartmentIdException("Department not existing with id :" + department.getId());
    }

    public Department delete(int id) throws InvalidDepartmentIdException {
    	Optional<Department> optDepartment = departmentRepo.findById(id);
        if (optDepartment.isPresent()) {
            Department department = optDepartment.get();
            departmentRepo.delete(department);
            return department;
        } else {
            throw new InvalidDepartmentIdException("Department not existing with id : " + id);
        }
    }
	
	
	

}
