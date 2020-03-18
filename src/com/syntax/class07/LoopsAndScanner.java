package com.syntax.class07;

import java.util.Scanner;

public class LoopsAndScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String name;
		int num = 1;
// print users name 5 times and good afternoon  5 times
		while (num <= 5) {
			System.out.println("What is your name?");
			name = scan.nextLine();

			System.out.println("Good afternoon " + name);
			num++;
		}
	}

}
