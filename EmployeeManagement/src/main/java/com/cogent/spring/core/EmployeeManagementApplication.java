package com.cogent.spring.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import com.cogent.spring.core.bean.Employee;
import com.cogent.spring.core.controller.EmployeeController;
import com.cogent.spring.core.service.EmployeeServiceImpl;

@SpringBootApplication
public class EmployeeManagementApplication {
	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(EmployeeManagementApplication.class);
		EmployeeController employeeController=ctx.getBean(EmployeeController.class);
		employeeController.manageEmployees();
		
		
	}

}
