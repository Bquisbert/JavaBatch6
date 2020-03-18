package com.syntax.class05;

import java.util.Scanner;

public class ScannerAndLogical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter sales");

		double sales = scan.nextInt();
		double commission;
		if (sales >= 1 && sales <= 100) {
			commission = sales * 0.10;

		} else if (sales >= 101 && sales <= 200) {
			commission = sales * 0.2;

		} else if (sales >= 201 && sales < 500) {
			commission = sales * 0.3;

		} else {
			commission = sales * 0.5;

		}System.out.println("Based on sales your commission is= "+commission);

		if (commission>100) {
			System.out.println("you are awesome seller!!");
		}
	}

}
