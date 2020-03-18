package com.syntax.class12;

public class SplitFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	String today="today is my favorite java class";
	String[] array=today.split("my");
	System.out.println(array.length);
	
	
	String today1="today is my favorite java class";
	
	String[] stringarray=today1.split("a");
	//print all elements 1 by 1
	
	for(String array1:stringarray) {
		System.out.print(array1+" ");
	}
	
	System.out.println();
	// string word by word
	String today2="today is my favorite java class";
	
	String[] words=today2.split(" ");
	for(int i=0;i<words.length;i++) {
		System.out.println(words[i]);
	}
	
	
	}

}
