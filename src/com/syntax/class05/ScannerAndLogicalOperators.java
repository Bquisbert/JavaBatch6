package com.syntax.class05;

import java.util.Scanner;

public class ScannerAndLogicalOperators {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 * take age from a user then based on age print output age 0-3 you are a baby
		 * 4-5 you are a kid 6-12 you are a child 13-19 you are a teenager 20-64 you are
		 * an adult >= 65 you are a senior
		 */
		System.out.println("Please enter your age");
		int age = scan.nextInt();

		if (age > 0 && age < 0) {
			System.out.println("Your are baby");
		} else if (age > 3 && age < 5) {
			System.out.println("you are kid");
		} else if (age >= 6 && age <= 12) {
			System.out.println("you are a child");
		} else if (age >= 13 && age <= 19) {
			System.out.println("you are a teenager");
		} else if (age >= 20 && age <= 65) {
			System.out.println("you are a adult");
		} else {
			System.out.println("you are enjoying life");
		}

	}

}
