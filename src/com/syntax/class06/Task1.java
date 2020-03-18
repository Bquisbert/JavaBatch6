package com.syntax.class06;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Country;
		String language;
	Scanner scan=new Scanner (System.in);
	System.out.println("Where are you from");
	String country=scan.nextLine();
	
	switch (country) {
	
	case "Brazil":
		language= "portuguese";
		break;
	case "usa":
		language="english";
		break;
		default:
			language="unknown";
	} System.out.println("your language is "+ language);
	
	
	
	
	
	
	
	
	}

}
