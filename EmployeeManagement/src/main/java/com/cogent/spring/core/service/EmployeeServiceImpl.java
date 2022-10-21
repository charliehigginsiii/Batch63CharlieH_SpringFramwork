package com.cogent.spring.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.spring.core.bean.Employee;
import com.cogent.spring.core.repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepo employeeRepo;

	@Override
	public void addEmployee(Employee employee) {
		employeeRepo.save(employee);
		
	}

	@Override
	public void deleteEmployeeById(Long Id) {
		employeeRepo.deleteById(Id);
		
	}

	@Override
	public Employee getEmployeeById(long LongId) {
		// TODO Auto-generated method stub
		return employeeRepo.getById(LongId);
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeRepo.findAll();
	}

	@Override
	public void updateEmployeeById(long LongId) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
