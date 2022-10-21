package com.cogent.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Manager {
	public static void main(String[]args) {
		//Spring way
		//1. Get the Spring Container- Factory
		//2. BeanFactory
		//2.ApplicationContext
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
		//2. Ask Spring Container to provide the required Bean.
		Coach coach=context.getBean(Coach.class);
		//3. Call the method- provideTraining
		coach.provideTraining();
		Coach theCoach=new Coach();
		theCoach.provideTraining();
	}
	
}
