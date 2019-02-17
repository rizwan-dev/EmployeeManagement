package com.riztech.empmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.riztech.empmanagement.dao.Employee;
import com.riztech.empmanagement.repository.EmployeeRepository;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeRepository empRepository;

	@GetMapping("/hello")
	public String sayHello() {

		return "Hello World";
	}

	@GetMapping("/hello/{name}")
	public String sayHelloWithName(@PathVariable("name") String name) {

		return "Hello , " + name;
	}

	@PostMapping("/create")
	public Employee saveEmployee(@RequestBody Employee employee) {

		return empRepository.save(employee);
	}

	@GetMapping("/get")
	public List<Employee> getAllEmployee() {
		return empRepository.findAll();
	}
	
	@GetMapping("/get/{name}")
	public Employee getAllEmployee(@PathVariable("name") String name) {
		return empRepository.findByName(name);
	}

}
