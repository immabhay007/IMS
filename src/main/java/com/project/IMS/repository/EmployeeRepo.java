package com.project.IMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.IMS.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
