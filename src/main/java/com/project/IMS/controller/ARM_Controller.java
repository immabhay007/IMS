package com.project.IMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.IMS.model.ARM;
import com.project.IMS.repository.ARM_Repo;


@RestController
@CrossOrigin("http://localhost:3000")
public class ARM_Controller      
{
	@Autowired
    private ARM_Repo armRepository;

    @PostMapping("/postarm")
    ARM newARM(@RequestBody ARM newARM) {
        return armRepository.save(newARM);
    }

    @GetMapping("/getarm")
    List<ARM> getAllUsers() {
        return armRepository.findAll();
    }
}
