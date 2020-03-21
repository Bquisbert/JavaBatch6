package com.syntax.class14;

public class Garage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//building individual objects
		
	Car	car1=new Car();
	car1.make="lambo";
	car1.model="gallardo";
	car1.year=2020;
	car1.color="blue";
	
	
	Car car2=new Car();
	
	car2.make="BMW";
	car2.model="M5";
	car2.year=2019;
	car2.color="pink";
	// i drive pink bmw
	System.out.println("i drive "+car2.color+" "+car2.make);
	
	car2.drive();       //Comes from void method
	car2.accelerate();
	car2.makeNoise();
	
	
	
	
	}

}
