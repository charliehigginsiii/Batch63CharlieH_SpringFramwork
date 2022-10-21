package com.cogent.spring.core.service;

import java.util.List;

import com.cogent.spring.core.bean.Employee;


public interface EmployeeService {
	void addEmployee(Employee employee);
	void deleteEmployeeById(Long Id);
	Employee getEmployeeById(long LongId);
	List<Employee> getAllEmployee();
	void updateEmployeeById(long LongId);
}
