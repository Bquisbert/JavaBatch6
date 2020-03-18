package com.syntax.class11;

public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String str1="hello";
	String str2=new String("hello");
	String str3="hello";
	
	if(str1==str2) {
		System.out.println("Strings are equal");
	}else {
		System.out.println("Strings are not equal");
	}
	
	if(str1==str3) {
		System.out.println("Equal");
	}else {
		System.out.println("not equal");
	}
	
	}

}
