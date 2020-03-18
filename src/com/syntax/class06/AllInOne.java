package com.syntax.class06;

import java.util.Scanner;

public class AllInOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Is there a sale?");
		String sale = scan.nextLine();
		if (sale.equalsIgnoreCase("yes")) {
			System.out.println("what is the price?");
		} else
			System.out.println("no sale");

		double price = scan.nextDouble();
		double discount = 0.0;
		double finalPrice = 0.0;
		if (price <= 20) {
			discount = price * 0.1;

		} else if (price > 20 && price < 100) {
			discount = price * 0.2;

		} else if (price > 100 && price < 500) {
			discount = price * 0.3;

		} else if (price > 500) {
			discount = price * 0.5;

		}
		finalPrice = price - discount;
		System.out.println(
				"after " + discount + " discount the price of the item reduced from " + price + " to " + finalPrice);

	}
}
