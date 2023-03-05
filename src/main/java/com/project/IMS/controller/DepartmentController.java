package com.project.IMS.controller;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.IMS.model.Department;
import com.project.IMS.repository.DepartmentRepo;

@RestController
@CrossOrigin("http://localhost:3000")
public class DepartmentController {

	@Autowired
	private DepartmentRepo departmentRepository;

	@PostMapping("/postdepartment")
	Department newDepartment(@RequestBody Department newDepartment) {
		return departmentRepository.save(newDepartment);
	}

	@GetMapping("/getdepartment")
	List<Department> getAllUsers() {
		return departmentRepository.findAll();
	}

}
