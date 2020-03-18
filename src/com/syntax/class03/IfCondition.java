package com.syntax.class03;

public class IfCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declare a number and compare if number is larger than 100
		//if number is larger than 100 ---> my number is large
		
		System.out.println("starting coding");
		
		int num=178;
		
		if(num>1000);{
			System.out.println("my number is large");
		}
		
		System.out.println("End of the program");
		
		
		int expectedHours=15;
		int actual=15;
		//if actual is more than expected you will love java
		if(actual>=expectedHours) {
		System.out.println("you will love Java");	
			}
		else { System.out.println("you will not love java");  //otherwise (if false)
			
		}
		
		
		double budget=100000;
		double carPrice=12000;
		
		//Use if we are doing verification and selective execution
		if(budget>carPrice) {System.out.println("i will buy this car today");
		System.out.println("i will be happy");

	}
		else {
			System.out.println("i will not buy this car today, " + "I will go learn Java ");
			System.out.println("I will be motivated");
		}
		System.out.println("code after condition");
	}
	
	
	
	
	
	
}
