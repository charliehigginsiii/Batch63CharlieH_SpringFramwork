package com.cogent.spring.core;

public class Car {
	private String brand;
	private String model;
	private int bhp;
	
	public Car(String brand, String model, int bhp) {
		super();
		this.brand = brand;
		this.model = model;
		this.bhp = bhp;
	}
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getBhp() {
		return bhp;
	}
	public void setBhp(int bhp) {
		this.bhp = bhp;
	}
	
}
