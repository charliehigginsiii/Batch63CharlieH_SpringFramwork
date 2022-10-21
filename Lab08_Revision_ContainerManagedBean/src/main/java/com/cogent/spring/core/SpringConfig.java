package com.cogent.spring.core;

import org.springframework.context.annotation.Bean;

public class SpringConfig {
	
	@Bean
	public Car getCar() {
		Car car=new Car();
		car.setBrand("Toyota");
		car.setModel("Camry");
		car.setBhp(100);
		return car;
	}
}
