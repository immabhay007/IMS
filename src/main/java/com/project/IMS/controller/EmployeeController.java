package com.project.IMS.controller;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.IMS.model.Employee;
import com.project.IMS.repository.EmployeeRepo;

@RestController
@CrossOrigin("http://localhost:3000")
public class EmployeeController {

	@Autowired
	private EmployeeRepo employeeRepository;

	@PostMapping("/postemployee")
	Employee newEmployee(@RequestBody Employee newEmployee) {
		return employeeRepository.save(newEmployee);
	}

	@GetMapping("/getemployee")
	List<Employee> getAllUsers() {
		return employeeRepository.findAll();
	}
}
