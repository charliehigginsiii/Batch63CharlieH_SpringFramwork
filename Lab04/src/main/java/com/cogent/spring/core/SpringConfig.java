package com.cogent.spring.core;

import org.springframework.context.annotation.Bean;

public class SpringConfig {
	@Bean
	public Coach getCoach() {
		return new FootballCoach();
	}
	@Bean
	public DietService getDietService() {
		return new DietService();
	}
}
