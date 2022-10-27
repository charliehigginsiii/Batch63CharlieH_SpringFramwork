package com.example.EmployeeManage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmployeeManage.entity.Celebration;
import com.example.EmployeeManage.service.CelebrationService;

@RestController
@RequestMapping("/api/celebrations")
public class CelebrationController {
	@Autowired
	CelebrationService celebrationService;
	
	@PostMapping("/addCelebration")
	public Celebration addACelebration(@RequestBody Celebration celebration) {
		return celebrationService.addCelebration(celebration);
	}
	@GetMapping("/getCelebrations")
	public List<Celebration> getCelebrations(){
		return celebrationService.getCelebrations();
	}
	@GetMapping("/sortbyName")
	public List<Celebration> SortByName(){
		return celebrationService.performSorting();
	}
	@GetMapping("/findbybudgetminimum/{budget}")
	public List<Celebration> getCelebrationsByBudget(@PathVariable float budget){
		return celebrationService.findCelebrationByBudget(budget);
	}
	@DeleteMapping("/deleteCelebration/{budget}")
	public int deleteCelebrationbyName(@PathVariable String name){
		return celebrationService.deleteCelebrationByName(name);
	}
}
