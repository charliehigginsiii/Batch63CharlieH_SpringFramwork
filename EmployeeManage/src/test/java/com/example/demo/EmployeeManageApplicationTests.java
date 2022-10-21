package com.example.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.EmployeeManage.controller.EmployeeController;

@SpringBootTest
class EmployeeManageApplicationTests {


	/*@Test
	void contextLoads() {
	}*/
	@Test
	public void testString() {
		EmployeeController controller=new EmployeeController();
		Assert.assertEquals("Charlie Higgins", controller.fetchString("Charlie", "Higgins"));
	}
	@Test
	void testingAddition() {
		
		EmployeeController emp=new EmployeeController();
		Assert.assertEquals(30,emp.addition(5,25));
		
	}
	@Test
	void testingMultiplication() {
		EmployeeController emp=new EmployeeController();
		double actual=emp.multiply(4.0, 6.0);
		assertEquals(24.0, actual);
	}
	@AfterEach
	void printStatement() {
		System.out.println("Print");
	}
	
}
