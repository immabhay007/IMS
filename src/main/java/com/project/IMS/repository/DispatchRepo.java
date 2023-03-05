package com.project.IMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.IMS.model.Dispatch;

public interface DispatchRepo extends JpaRepository<Dispatch, Integer> {

}
