package com.cogent.boot.Lab10_BootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Bean.Car;

@SpringBootApplication
public class Lab10BootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(Car.class);
		Car car=context.getBean(Car.class);
		car.letsGo();
		SpringApplication.run(Lab10BootDemoApplication.class, args);
	}

}
