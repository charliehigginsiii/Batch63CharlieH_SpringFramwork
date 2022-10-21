package com.cogent.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Manager {
	public static void main(String[]args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
		Coach coach=context.getBean(Coach.class);
		coach.provideTraining();
	}
}
