package com.cogent.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Manager {
	public static void main(String[]args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
		//Car car=context.getBean(Car.class);
		//System.out.println(car.getModel());
		Mobile mobile=context.getBean(Mobile.class);
		mobile.setBrand("Apple");
		System.out.println(mobile);
	}

}
