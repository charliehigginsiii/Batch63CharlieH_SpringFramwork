package com.cogent;

public class Car {
	private Engine engine;
	public Car(Engine engine) {
		this.engine=engine;
	}
	public Car() {
		
	}
	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void letsGo() {
		engine.startEngine();
		System.out.println("We started our journey");
		System.out.println("We are travelling");
		System.out.println("We reached our destination");
		engine.stopEngine();
	}
}
