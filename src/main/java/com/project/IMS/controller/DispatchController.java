package com.project.IMS.controller;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.IMS.model.Dispatch;
import com.project.IMS.repository.DispatchRepo;

@RestController
@CrossOrigin("http://localhost:3000")
public class DispatchController 
{
	
	@Autowired
    private DispatchRepo dispatchRepository;

    @PostMapping("/postdispatch")
    Dispatch newDispatch(@RequestBody Dispatch newDispatch) {
        return dispatchRepository.save(newDispatch);
    }

    @GetMapping("/getdispatch")
    List<Dispatch> getAllUsers() {
        return dispatchRepository.findAll();
    }
	
}

