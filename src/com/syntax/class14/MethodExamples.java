package com.syntax.class14;

public class MethodExamples {
	//want to create a method that will be greeting a person
		
		
	void greet() {
		System.out.println("Hello Sarmed");
	}
	
	void greet1(String name) {
		System.out.println("Hello "+name);
	}
	
	public static void main(String[] args) {
		//how to call method greet--> we need to create an object of the class
		//where that method belongs
		
		MethodExamples	object1=new MethodExamples();
		object1.greet();
		
		//======================
		
		object1.greet1("Sarmed");
		object1.greet1("Brian");
		object1.greet1("Mahady");
		
		
		
		
	}
	
	

}
