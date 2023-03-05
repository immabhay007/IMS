package com.project.IMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.IMS.model.FI;
import com.project.IMS.repository.FI_Repo;



@RestController
@CrossOrigin("http://localhost:3000")
public class FI_Controller 
{
	@Autowired
    private FI_Repo fiRepository;

    @PostMapping("/postfi")
    FI newFI(@RequestBody FI newFI) {
        return fiRepository.save(newFI);
    }

    @GetMapping("/getfi")
    List<FI> getAllUsers() {
        return fiRepository.findAll();
    }
}
