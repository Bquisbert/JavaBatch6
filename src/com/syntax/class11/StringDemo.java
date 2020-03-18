package com.syntax.class11;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String school="Syntax";
	
	String str=new String ("Hello");
	
	String str1="this is a string 7767gt";
	
	//getting amount of characters
	System.out.println("--Length function--");
	System.out.println(school.length());
	
	int size=str.length();
	System.out.println("String length is "+size);
	
	//converting to lower or upper case
	System.out.println("--ToUpper/ToLower function--");
	
	System.out.println(school.toUpperCase());
System.out.println(	str.toLowerCase());

   //concatinate 2String
System.out.println("--Concat function--");

String newString=str+school;
	System.out.println(newString);
	
	
	String day="saturday";
	String date="14";
	String newDate=day.concat(date);
	
	System.out.println(newDate);
	
	
	
	char grade='A';
	String str2="Student";
	
	//below code will give CE, "concat" only works with Strings
	//str2.concat(grade);
	
	
	System.out.println("--isEmpty function--");
	//will tell us if something is storeed there
	String str3="";
	boolean empty=str3.isEmpty();
	System.out.println(empty);
	
	System.out.println("--trim() function--");
	//removes white spaces
	String str4="         Welcome to Syntax!   ";
	
	str4=str4.trim();
	System.out.println("String with no leading or Trailing spaces "+str4);
	
	
	
	
	}
	
}
