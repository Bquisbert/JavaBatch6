package com.syntax.class17;

public class StaticKeyword {

	String color;
	int mem;
	
	static String brand;
	static boolean screen;
	
	static void displayInfo() {
		System.out.println("we are building "+brand+" with touchscreen= "+screen);
	}
	
	void displaySpecs() {
		System.out.println("we build phone with "+mem+" GB memory in "+color+" color");
	}
	
	public static void main(String[] args) {
		
		
	brand="iPhone";
	screen=true;
	
	StaticKeyword obj=new StaticKeyword();
		
		
		obj.color="grey";
		obj.mem=64;
		
		
		displayInfo();// acessing method in static way
		
		obj.displaySpecs();
		
		
	}
	
	
	
}
