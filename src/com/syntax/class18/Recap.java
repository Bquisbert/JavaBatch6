package com.syntax.class18;

public class Recap {
	
	private static String getVowels(String str) {
		String vowels;
		vowels=str.replaceAll("[^aeiouAEIOU]", "");
		return vowels;
	}
	
	
	public static void main(String[] args) {
		
		
		
	String vowels=getVowels("hello");
	System.out.println(vowels);
		
		Task1 obj=new Task1("Brian", 99, 89, 97);
		obj.avg();
		
		
		
	}
	
	
	

}
