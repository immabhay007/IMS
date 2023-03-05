package com.project.IMS.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.IMS.model.RMI;
import com.project.IMS.repository.RMI_Repo;

@RestController
@CrossOrigin("http://localhost:3000")
public class RMI_Controller 
{
	
	@Autowired
    private RMI_Repo rmiRepository;

    @PostMapping("/postrmi")
    RMI newRMI(@RequestBody RMI newRMI) {
        return rmiRepository.save(newRMI);
    }

    @GetMapping("/getrmi")
    List<RMI> getAllUsers() {
        return rmiRepository.findAll();
    }
	
}
