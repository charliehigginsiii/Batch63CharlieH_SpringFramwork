package com.cogent.spring.core;

public class Car {
	private Engine engine;
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine=engine;
	}
	public void letsGo() {
		engine.startEngine();
		System.out.println("We are enjoying");
		engine.stopEngine();
	}
}
