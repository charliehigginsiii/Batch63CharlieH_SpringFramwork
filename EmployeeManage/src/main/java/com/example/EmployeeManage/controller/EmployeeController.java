package com.example.EmployeeManage.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

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

import com.example.EmployeeManage.entity.Confirmation;
import com.example.EmployeeManage.entity.Employee;
import com.example.EmployeeManage.repo.EmployeeRepo;
import com.example.EmployeeManage.service.CustomerService;
import com.example.EmployeeManage.service.EmployeeService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
	@Autowired
    EmployeeRepo employRepository;
	
	 @PostMapping("/addemployee")
	  public Employee newEmployee(@Valid @RequestBody Employee employee) {
	    return employRepository.save(employee); 
	  }
	  @GetMapping("/getemployee")   
	  List<Employee> getAllEmployee() {
	    return employRepository.findAll();
	  }
	  @GetMapping("/getemployee/{Id}")
	  Employee getEmployeeById(@PathVariable int Id) {
		    Optional<Employee> employee=employRepository.findById(Id);
		    return employee.get();
	  }
	  @DeleteMapping("/deleteEmployeeById/{Id}")
	  Confirmation deleteEmployeeById(@PathVariable int Id){
		  employRepository.deleteById(Id);
		  return new Confirmation("Employee with the id "+Id+" has been deleted");
	  }
	  @GetMapping("/getEmployees/sortbyname")
	  List<Employee> getEmployeesByNameOrder(){
		  return employRepository.findAllSortedByName();
	  }
	  @GetMapping("/getEmployees/getbyminimumsalary/{salary}")
	  List<Employee> getEmployeesBySalaryOrder(@PathVariable float salary){
		  return employRepository.findBySalary(salary);
	  }
	  @PutMapping("/updateEmployee/{id}")
	  public Employee updateEmployee(@PathVariable int id,@RequestParam String name,@RequestParam String dept, @RequestParam float salary ) {
		  Optional<Employee> employeeobject=employRepository.findById(id);
		  Employee employee=employeeobject.get();
		  employee.setId(id);
		  employee.setName(name);
		  employee.setDept(dept);
		  employee.setSalary(salary);
		  employRepository.save(employee);
		  return employee;  
	  }
	  
	  @Autowired
	  
	  CustomerService customerService;
	  
	  @GetMapping("/getEmployees/sortbyname1")
	  List<Employee> getEmployeesByNameOrder1(){
		  return customerService.performSorting();
	  }
	  
	  
	  @DeleteMapping("/deleteEmployee/byName/{name}")
	  int deleteEmployeeByName(@PathVariable String name){
		  customerService.deletebyname(name);
		  return 1;
	  }
 @Autowired
	  
	  EmployeeService employeeService;
 		@PutMapping("/updateEmployeeName/{id}")
 		public Integer updateEmployeeName(@RequestParam String name, @PathVariable long id) {
			return employeeService.updateName(name,id);
		}
 		@PutMapping("/updateEmployeeDept/{id}")
		public Integer updateEmployeeDept(@RequestParam String dept, @PathVariable long id) {
			return employeeService.updateDept(dept,id);
		}
 		@PutMapping("/updateEmployeeSalary/{id}")
		public Integer updateEmployeeSalary(@RequestParam float salary, @PathVariable long id) {
			return employeeService.updateSalary(salary,id);
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

