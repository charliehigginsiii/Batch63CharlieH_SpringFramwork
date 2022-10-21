package com.cogent.spring.core;

import org.springframework.beans.factory.annotation.Autowired;

public class FootballCoach implements Coach {
	private DietService dietService;
	@Autowired
	public void setDietService(DietService dietService) {
		this.dietService=dietService;
	}
	
	public void provideTraining() {
		System.out.println("Lets do some warmup");
		System.out.println("After cool down take protein diet");
		dietService.getProteinDiet();
	}
}
