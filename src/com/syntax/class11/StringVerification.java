package com.syntax.class11;

public class StringVerification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	String message="Welcome Admin!";
	// verify that message contains username "Admin"
	System.out.println("--contains function--");
	System.out.println(message.contains("Admin"));
	
	boolean flag=message.contains("welcome");// false because w is lower case in ""
	System.out.println(flag);
	
	//we want to verify what String starts with
	System.out.println("--StartsWith() function--");
	boolean starts=message.startsWith("Welcome");
	System.out.println(starts);
	
	//we want verify that String ends with 
	System.out.println("--endsWith() function--");
	String username="Admin";
	
	boolean ends=message.endsWith(username);
	
	System.out.println(ends);
	
	
	
	
	
	}

}
