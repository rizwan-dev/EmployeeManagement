package com.riztech.empmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.riztech.empmanagement.dao.Employee;


@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Long>{
	
	
	public Employee findByName(String name); 
	

}
