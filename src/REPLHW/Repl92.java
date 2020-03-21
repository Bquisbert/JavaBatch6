package REPLHW;

import java.util.Scanner;

public class Repl92 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
//		Using Scanner class input string value. 
//		Print out the following: "The first 3 letters of ___ is ___"
//
//		For example, if the input is "banana", your output should be: "The first 3 letters of banana is ban".
	
	
	Scanner scan=new Scanner (System.in);
	
	String name=scan.nextLine();
			
	
		System.out.println("The first 3 letters of "+ name+ " is "+name.substring(0,3));
	
	
	}

}
