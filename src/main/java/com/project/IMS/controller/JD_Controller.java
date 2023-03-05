package com.project.IMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.IMS.model.JD;
import com.project.IMS.repository.JD_Repo;



@RestController
@CrossOrigin("http://localhost:3000")
public class JD_Controller 
{
	@Autowired
    private JD_Repo jdRepository;

    @PostMapping("/postjd")
    JD newJD(@RequestBody JD newJD) {
        return jdRepository.save(newJD);
    }

    @GetMapping("/getjd")
    List<JD> getAllUsers() {
        return jdRepository.findAll();
    }
}
