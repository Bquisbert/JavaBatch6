package com.syntax.class06;

import java.util.Scanner;

public class ScannerAndSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ask user gender m or f based on gender will provide description
		 */
		Scanner scan = new Scanner(System.in);
		String genderType;

		System.out.println("Please enter gender:M or F");
		char gender = scan.next().charAt(0);

		switch (gender) {

		case 'M':
			genderType = "Male";
			break;
		case 'F':
			genderType = "Female";
			break;
		default:
			genderType = "unknown";

		} System.out.println("your gender is "+genderType);

	}

}
