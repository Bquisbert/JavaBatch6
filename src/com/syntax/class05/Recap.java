package com.syntax.class05;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
//
//		System.out.println("Please enter any text");
//		String text = scan.nextLine();
//
//		System.out.println("Please enter any text");
//		String text1 = scan.nextLine();
//
//		System.out.println(text);
//		System.out.println(text1);
//
//		System.out.println("Please enter any number");
//		int num = scan.nextInt();
//
//		System.out.println("Please enter any decimal");
//		double d = scan.nextDouble();
//
//		System.out.println(num);
//		System.out.println(d);
//-------------------------------------------------------------------------------------

	
	
	
		
		System.out.print("Do you use credit card? ");
		String answer = scan.nextLine();
		if (answer.equalsIgnoreCase("Yes")){
			System.out.print("what is the current balance on your credit card?");
			double c=scan.nextDouble();
			if (c>=1000) {
				System.out.println("Please pay off your dues immediately");
			}else {
				System.out.println("Please spend more to get higher credit limit");
			}
		} else {
			System.out.println("We have a great Credit Card offer for you. Are you interested?");
		}

	
	
	
	
	
	
	
	
	
	}

}
