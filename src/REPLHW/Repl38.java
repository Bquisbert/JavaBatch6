package REPLHW;

import java.util.Scanner;

public class Repl38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Prompt user with a question: "Is it weekend?"
//			If it is not a weekend --> subject="Manual testing"
//			Otherwise --> subject="Java"
//
//			Output: 
//			"Today you will be learning ____"
	Scanner scan=new Scanner (System.in);
	String day;
	
	System.out.println("Is it weekend?");
	boolean week=scan.nextBoolean();
	
	if (!week) {
		day="Manual testing";
	}else {
		day="Java";
	}
	System.out.println("Today you will be learning "+ day);
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
