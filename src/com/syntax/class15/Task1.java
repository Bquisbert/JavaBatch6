package com.syntax.class15;

public class Task1 {

	
	void num1(int a,int b) {
		if(a>b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
	}
	
	
	void odd(int a) {
		if(a%2==0) {
			System.out.println("its even");
		}else {
			System.out.println("its odd");
		}
	}
	
	
	void country(String lang) {
	
		if(lang.equalsIgnoreCase("Spanish")) {
			System.out.println("Hola");
		}else if(lang.equalsIgnoreCase("English")) {
			System.out.println("hello");
		}else {
			System.out.println("N/A");
		}
		
	}
	
	
	
	
	
	
	
	
}
