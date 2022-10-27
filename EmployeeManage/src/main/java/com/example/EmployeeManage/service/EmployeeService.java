package com.example.EmployeeManage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployeeManage.entity.Employee;
import com.example.EmployeeManage.repo.EmployeeRepo;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepo employeeRepo;
	public List<Employee> performSorting() {
		return employeeRepo.findAllSortedByName();
	}
	public Integer updateName(String name, long id) {
		return employeeRepo.updateEmployeeName(name,id);
	}
	public Integer updateDept(String dept, long id) {
		return employeeRepo.updateEmployeeDept(dept,id);
	}
	public Integer updateSalary(float salary, long id) {
		return employeeRepo.updateEmployeeSalary(salary,id);
	}
	
}
