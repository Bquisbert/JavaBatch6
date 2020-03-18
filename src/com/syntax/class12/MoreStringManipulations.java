package com.syntax.class12;

public class MoreStringManipulations {

	public static void main(String[] args) {
		//to get substring from string
		
	System.out.println("----substring() FUNCTION----");
	
	String str="Today is a rainy day";
	
	//is a rainy day
	String partialString=str.substring(6);//starts from 6 till end
	System.out.println(partialString);
	
	
	
	//today      //cut a specific piece out
	partialString=str.substring(0, 5);
    System.out.println(partialString);
	
	
	
	
	}
}
