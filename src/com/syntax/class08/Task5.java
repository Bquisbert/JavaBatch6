package com.syntax.class08;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int sum = 0;
		int sum1 = 0;
		System.out.println("enter two numbers");
		int min = scan.nextInt();
		int max = scan.nextInt();

		for (int i = min; i < max; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			} else {
				sum1 = sum1 + i;
			}

		}
		System.out.println(sum);
		System.out.println(sum1);
	}
}