package com.syntax.class12;

public class MoreFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String me="I am a good tester";
	
	
	System.out.println("---replace() FUNCTION-----");
	
	String newString=me.replace("a", "c");
	
	me=me.replace("good", "great");
	
	System.out.println(me);
	
	System.out.println("---ReplaceALL FUNCTION----");
	
	String str="phone number is 709789664";
	
	str=str.replaceAll("[A-Za-z]","" );
	System.out.println(str);
	
	
	String str1="h32454?e&%}{&$ll<>o";
	
	str1=str1.replaceAll("[^A-Za-z]","");//
	System.out.println(str1);
	
	
	
	}

}
