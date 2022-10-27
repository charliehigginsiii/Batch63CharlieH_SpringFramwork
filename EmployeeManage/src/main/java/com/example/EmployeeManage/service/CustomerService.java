package com.example.EmployeeManage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployeeManage.entity.Employee;
import com.example.EmployeeManage.repo.EmployeeRepo;

@Service
public class CustomerService {
	@Autowired
	EmployeeRepo employeeRepo;
	public List<Employee> performSorting() {
		return employeeRepo.findAllSortedByName();
	}
	public int deletebyname(String name) {
		return employeeRepo.deleteByName(name);
	}
}
