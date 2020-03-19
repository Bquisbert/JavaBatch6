package com.syntax.class13;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	/*
	 * Write a program to swap 2 numbers without a temporary variable? swap2
	 * 
	 */
	
	
	int a=10;
	int b=20;
	
	a=a+b;//30
	b=a-b;//30-20=10
	a=a-b;
	
	System.out.println("The value of a ="+a);
	System.out.println("The value of b ="+b);
	
	String str1="day";
	String str2="night";
	
	str1=str1+str2;//daynight
	str2=str1.substring(0, 3);
	str1=str1.substring(3);
	
	System.out.println("The value of str1 ="+str1);
	System.out.println("the value of str2 ="+str2);
	}

}
