package com.example.EmployeeManage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
@EnableWebSecurity
@SpringBootApplication
public class EmployeeManageApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(EmployeeManageApplication.class, args);
	}
	
}
