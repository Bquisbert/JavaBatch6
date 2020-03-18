package com.syntax.class06;

import java.util.Scanner;

public class CompareTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
//		Program to find largest number among three numbers using nested if
//		provided by a user (numbers must be distinct)
		System.out.println("Please enter First Number");
		double firstNum = input.nextDouble();
		System.out.println("Please enter 2nd Number");
		double secondNum = input.nextDouble();
		System.out.println("Please enter 3rd Number");
		double thirdNum = input.nextDouble();
		double number;

		if (firstNum > secondNum && firstNum> thirdNum) {
			number = firstNum;
		} else if (secondNum > firstNum && secondNum > thirdNum) {
			number = secondNum;
		} else {
			number = thirdNum;
		}

		System.out.println("The largest number is the " + number);

	}

}
