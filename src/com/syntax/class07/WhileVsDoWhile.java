package com.syntax.class07;

public class WhileVsDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//hello 5 time
		
		int num=11;
		while(num<=5) {
			System.out.println("Hello");
			num++;
		}
	
	System.out.println("----------USING DO WHILE--------------------");
	// hi 5 times
	int num1=11;
	do {
		System.out.println("hi");//do will get executed no matter what once
		num1++;
	}while(num1<=5);
	
	
	
	
	}

}
