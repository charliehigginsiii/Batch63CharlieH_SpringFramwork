package com.cogent.spring.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.cogent.spring.core.bean.Employee;
import com.cogent.spring.core.service.EmployeeService;

@Component
public class EmployeeController {
	
	
	@Autowired
	EmployeeService employeeService;
	
	
	public void manageEmployees(){
		Employee employee=new Employee();
		employee.setName("Charlie");
		employee.setDepartment("Information Technology");
		employee.setSalary(60000.0);
		
		employeeService.addEmployee(employee);
		System.out.println("Employee Added.");
	}
}
