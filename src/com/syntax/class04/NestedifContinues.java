package com.syntax.class04;

public class NestedifContinues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// check if patient has allergies
		// if no --> you are healthy
		// otherwise check if patient has;
		// orange allergie--> do not eat orange
		// apple allergie-->do not eat apples
		// kiwi allergie---> do not eat kiwi

		boolean allergie = true;
		boolean apple = true;
		boolean orange = false;
		boolean kiwi = true;
		
		if(allergie) {
			System.out.println("please answer below");
			if(orange) {
				System.out.println("do eat oranges");
			}
			if (apple)
			{System.out.println("do not eat apple");}
			
			if (kiwi) {System.out.println("do not eat kiwi");}
			
			
		
		
		}
		else {System.out.println("you are healthy");
		
		}
		
		
		
		
		
		

	}

}
