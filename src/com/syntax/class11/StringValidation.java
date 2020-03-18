package com.syntax.class11;

public class StringValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		//compare 2 Strings
		System.out.println("--equals() equalsIgnorecase() function--");
	String str1="Welcome Syntax Students";
	
	String str2=new String("Welcome Syntax Students");
	System.out.println(str1==str2);
	System.out.println(str1.equals(str2));
	
	System.out.println(str1.equalsIgnoreCase(str2));
	
	
	//.trim() and .equals( )
	System.out.println("--trim and then compare--");
	
	String expected="Home - Syntax Technologies";
	String actual="Home - Syntax Technologies     ";
	
	if(actual.trim().equals(expected)) {
		System.out.println("Test case pass. Titles match");
	}else {
		System.out.println("Test case Fail. Titles do NOT match");
	}
	
	 String browser="CHROME";
     if(browser.trim().equalsIgnoreCase("chrome")) {
         System.out.println("Test executed on chrome browser");
     }
     //OR
     
     if(browser.toLowerCase().equals("chrome")) {
         System.out.println("Test executed on chrome browser");
     }

	
	
	
	
	}

}
