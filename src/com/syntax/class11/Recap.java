package com.syntax.class11;

public class Recap {

	public static void main(String[] args) {

	String[][] groceries= {
			{"cucumber","potato","carrot",},
			{"mango","apple","banana","kiwi",},
			{"milk","cheese","yogurt"}
			
	};
	//get values from 2d arrays
	
	for(int r=0;r<groceries.length;r++) {
		
		for(int c=0;c<groceries[r].length;c++) {
			System.out.print(groceries[r][c]+" ");
		}
			
	}
	
	System.out.println();//outside loop
	
	
	System.out.println("--USING ADVANCED FOR  LOOP--");
	
	for(String[] list:groceries) {
		
		for(String items:list) {
			System.out.print(items+" ");
		}
		System.out.println();// in loop
	}
	
	
	
	
	}

}
