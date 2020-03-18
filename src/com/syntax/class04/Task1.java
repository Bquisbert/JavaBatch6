package com.syntax.class04;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean diploma = true;
		double gpa = 3.9;

		if (diploma) {
			System.out.println("Congratulations");

			if (gpa >= 3.5) {
				System.out.println("you are eligible for scholarship");
			}

		} else {
			System.out.println("you should have studied harder");
		}

		double rate = 4.2;
		int price = 185000;

		if (rate > 4.5) {
			System.out.println("I Will not buy this house");

		} else {
			System.out.println("i will consider");

			if (price > 200000) {
				System.out.println("I will take loan");
			} else {
				System.out.println("i will pay cash");
			}
		}
	
	
	
	}

}
