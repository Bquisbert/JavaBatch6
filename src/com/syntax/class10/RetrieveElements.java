package com.syntax.class10;

public class RetrieveElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] fruits = { "banana", "kiwi", "apple", "mango" };
		
		for (String fruit : fruits) {
			if(fruit.equals("apple"))
			System.out.println(fruit+" is your favorite fruit");
			else {
				System.out.println(fruit);
			}
		}

	}

}
