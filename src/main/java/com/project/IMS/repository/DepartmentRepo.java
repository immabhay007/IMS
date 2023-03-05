package com.project.IMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.IMS.model.Department;

public interface DepartmentRepo extends JpaRepository<Department, Integer> {

}
