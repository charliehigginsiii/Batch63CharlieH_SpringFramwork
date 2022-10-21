package com.example.EmployeeManage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmployeeManage.entity.Complain;
import com.example.EmployeeManage.entity.Employee;
import com.example.EmployeeManage.repo.ComplainRepo;
import com.example.EmployeeManage.repo.EmployeeRepo;
@RestController
@RequestMapping("/api/complain")
public class ComplainController {
	@Autowired
    ComplainRepo complainRepo;
	
	 @PostMapping("/addcomplain")
	  public Complain newEmployee(@RequestBody Complain complain) {
	    return complainRepo.save(complain);   //insert SQL
	  }
	
	
	
	
	  @GetMapping("/getcomplain")   //End Point 
	 //@RequestMapping(method=RequestMethod.GET ,value="/users")
	  List<Complain> getAllEmployee() {
	    return complainRepo.findAll();
	  }
}
