package com.syntax.class08;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner Scan=new Scanner (System.in);	
	String item;
	double price;
	double money;
	double amount=0;
	double change;
	double remain;
	
	System.out.println("What are you buying today");
	item=Scan.nextLine();
	
	System.out.println("what is the price?"+item);
	price=Scan.nextDouble();
	
	do {
		System.out.println("PLease give payment");
		money=Scan.nextDouble();
		
		amount=amount+money;
		
		if(amount<price) {
			remain=price-amount;
		}else if (amount>price) {
			change=amount-price;
		}else {
			System.out.println("Thank you");
		}
			
	}while (price!=amount); {
		
		
	}

	
	
	
	
	
	}

}
