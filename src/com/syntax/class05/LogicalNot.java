package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean b = !true;
		boolean val = !false;
		
		//NOT - reverses the condition
		
		System.out.println(b);

		boolean isCold=!true;
		if (!isCold) {
			System.out.println("hello");
		}else System.out.println("bye");
		
		String day1="tuesday";
		
		
		// if it is not mon or fri find me at syntax
		
		
		if(!(day1.equals("monday") || day1.equals("Friday"))) {
			System.out.println("find me at syntax");
		}
	
	
	
	}

}
