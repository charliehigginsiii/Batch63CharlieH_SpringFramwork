package com.cogent;

public class Manager {
	public static void main(String[]args) {
		Engine engine=new Engine();
		
		Car car=new Car(engine);
		//car.setEngine(engine);
		car.letsGo();
	}
}
