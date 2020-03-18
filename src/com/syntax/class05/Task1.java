package com.syntax.class05;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter height in inches");
		int inch = scan.nextInt();

		if (inch <= 60) {
			System.out.println("you are short");
		} else if (inch >= 61 && inch < 72) {
			System.out.println("you are medium");
		} else  {
			System.out.println("you are tall");

		}
		
		Scanner java=new Scanner (System.in);
		
		System.out.println("Please enter day");
		int day=scan.nextInt();
		
		if (day>=1 && day<=5) {
			System.out.println("it is a week day");
		}else if (day>=6 && day<=7) {
			System.out.println("it is a weekend");
		}else {System.out.println("invalid");
		
		}
	
		
		
		

	}

}
