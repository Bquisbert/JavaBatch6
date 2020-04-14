package com.syntax.class24;

public abstract class Vehicle {

	public void drive() {
		System.out.println("Vehicle drives");
	}
	
	public void stop() {
		System.out.println("Vehicle stops");
	}
	
	public abstract void start();
	
	public abstract void brake();
	
	
}
