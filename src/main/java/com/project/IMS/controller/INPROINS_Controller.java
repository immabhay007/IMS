package com.project.IMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.IMS.model.FI;
import com.project.IMS.model.INPROINS;
import com.project.IMS.repository.INPROINS_Repo;



@RestController
@CrossOrigin("http://localhost:3000")
public class INPROINS_Controller
{
	@Autowired
    private INPROINS_Repo inproinsRepository;
	
	 @PostMapping("/postinproins")
	    INPROINS newINPROINS(@RequestBody INPROINS newINPROINS) {
	        return inproinsRepository.save(newINPROINS);
	    }

	    @GetMapping("/getinproins")
	    List<INPROINS> getAllUsers() {
	        return inproinsRepository.findAll();
	    }

}
