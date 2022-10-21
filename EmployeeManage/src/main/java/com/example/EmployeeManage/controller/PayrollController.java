package com.example.EmployeeManage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmployeeManage.entity.Employee;
import com.example.EmployeeManage.entity.Payroll;
import com.example.EmployeeManage.repo.PayrollRepo;

@RestController
@RequestMapping("/api/payroll")
public class PayrollController {
	@Autowired 
	PayrollRepo payrollRepo;
	@PostMapping("/newpayroll")
	public Payroll newPayroll(@RequestBody Payroll payroll) {
		return payrollRepo.save(payroll);
	}
	 @GetMapping("/getpayroll")   //End Point 
	  List<Payroll> getAllEmployee() {
	    return payrollRepo.findAll();
	  }

}
