package com.example.EmployeeManage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmployeeManage.entity.Employee;
import com.example.EmployeeManage.repo.EmployeeRepo;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
	@Autowired
    EmployeeRepo employRepository;
	
	 @PostMapping("/addemployee")
	  public Employee newEmployee(@RequestBody Employee employee) {
	    return employRepository.save(employee);   //insert SQL
	  }
	  @GetMapping("/getemployee")   
	  List<Employee> getAllEmployee() {
	    return employRepository.findAll();
	  }
	  @GetMapping("/getemployee/{Id}")
	  Employee getEmployeeById(@PathVariable int Id) {
		    return employRepository.getReferenceById(Id);
	  }
	  @DeleteMapping("/deleteEmployeeById/{Id}")
	  void deleteEmployeeById(@PathVariable int Id){
		  employRepository.deleteById(Id);
	  }
	  
	  @PutMapping("/updateEmployeeById/{Id}")
	  void updateEmployeeById(@PathVariable int Id,@RequestParam String name, @RequestParam String dept, @RequestParam float salary) {
		  Employee newobject=employRepository.getReferenceById(Id);
		  if(!name.equals(null)||!dept.equals(null)||salary!=0.0) {
			  employRepository.deleteById(Id);
		  }
		  int counter=0;
		  if(!name.equals(null)) {
			  newobject.setName(name); 
			  counter++;
		  }if(!dept.equals(null)) {
			  newobject.setDept(dept); 
			  counter++;
		  }if(salary!=0.0) {
			  newobject.setSalary(salary); 
			  counter++;
		  }
		  if(counter>0) {
			  employRepository.save(newobject);
		  }
	  }
	public int addition(int a,int b) {
		return (a+b);
	}
	public String fetchString(String s, String s1) {
		return s+" "+s1;
	}
	public double multiply(double a, double b) {
		return a*b;
	}
	
	

}

