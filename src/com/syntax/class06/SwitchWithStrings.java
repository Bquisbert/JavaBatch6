package com.syntax.class06;

import java.util.Scanner;

public class SwitchWithStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*ask user where they are from
 * based on country we will define favortie food
 * your favorite food is___
 */
	
		String country;
		String food;
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter your counrty");
		country=scan.nextLine();
		
		switch(country.toUpperCase()) {
		
		case "MOROCCO":
			food="couscous";
			break;
		case "BELARUS":
			food="potato";
			break;
		case "TURKEY":
			food="baklava";
			break;
			default:
				food="unknown";
		
		} System.out.println("your favorite food is "+food);
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
