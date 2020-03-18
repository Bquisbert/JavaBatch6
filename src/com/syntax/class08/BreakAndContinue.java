package com.syntax.class08;

public class BreakAndContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//once i=4 --> we want to stop the loop
		
		for(int i=1; i<=10; i++) {
			if(i==4) {
				System.out.println("Stop looping");
				break;
			}System.out.println(i);
			
			
			
			
		}
		System.out.println("OUTSIDE LOOP");
	
	System.out.println("_______________________________________");
	
	for(int y=1; y<=10; y++) {
		if(y==4) {
			System.out.println("I am skipping iteration");
			continue;
		}
		
		System.out.println(y);
	}
	System.out.println("___________________________________");
	//print numbers from 1-100
	//skip 35-55
	for(int i=1; i<=100; i++) {
		if(i>=35 && i<=55) {
			continue;
		}
		System.out.println(i);
	}
	
	
	}

}
