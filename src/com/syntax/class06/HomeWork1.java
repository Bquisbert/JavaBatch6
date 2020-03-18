package com.syntax.class06;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner dob=new Scanner(System.in);
//		Write a program for user to enter his/hers birth month. Based on the
//		month define the season.
//		Example: if user is born in June, July or August → season =“Summer”.
//		At the end of the program we should see output as “You were born ______“.
		System.out.println("Please enter your Birth of Month");
		String month=dob.nextLine();
		String season="";
		if(month.equalsIgnoreCase("December")||month.equalsIgnoreCase("January")||month.equalsIgnoreCase("February")){
		season="Winter";
		}else if(month.equalsIgnoreCase("March")||month.equalsIgnoreCase("April")||month.equalsIgnoreCase("May")){
		season="Spring";	
		}else if(month.equalsIgnoreCase("June")||month.equalsIgnoreCase("July")||month.equalsIgnoreCase("August")) {
		season="Summer";	
		}else if(month.equalsIgnoreCase("September")||month.equalsIgnoreCase("October")||month.equalsIgnoreCase("November")) {
		season="Fall";
		}
		System.out.println("you were born in "+season);
	
	
	
	
	
	
	
	
	
	}

}
