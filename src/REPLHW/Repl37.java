package REPLHW;

import java.util.Scanner;

public class Repl37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
//		Take 2 boolean inputs from a user:
//			 
//			"Are you thirsty?"
//			"Are you sleepy?"
//
//			If user is thirsty and not sleepy--> drink=Water
//			If user is thirsty and sleepy--> drink=Coffee
//			If user is not thirsty and sleepy --> drink=Tea
//			Otherwise drink="Nothing"
//
//			Output:
//			"Looks like you need to drink ___ "
	
	Scanner scan=new Scanner (System.in);
	String drink;
	System.out.println("Are you thirsty?");
	boolean thirst=scan.nextBoolean();
	
	System.out.println("Are you sleepy?");
	boolean sleep=scan.nextBoolean();
	
	if (thirst && !sleep) {
		drink="Water";
	}else if (thirst && sleep) {
		drink="Coffee";
	}else if (!thirst && sleep) {
		drink="Tea";
	}else {
		drink="Nothing";
	}
	System.out.println("Looks like you need to drink "+drink);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
