package com.syntax.class34;

public class Task1 {

	public static void ageRequirement(int age) {
		if (age < 16) {
			throw new RuntimeException("Must be 16 or older");
		}else {
			System.out.println(age+": access granted");
		}
	}



	public static void main(String[] args) {

		ageRequirement(14);

		
		
	}

}
