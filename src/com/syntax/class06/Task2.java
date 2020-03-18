package com.syntax.class06;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner scan=new Scanner (System.in);
 char grade;
 String ex;
 
 System.out.println("enter grade");
  grade=scan.next().charAt(0);
  
  switch(grade) {
  case 'A':
	  ex="Excellent";
	  break;
  case 'B':
	  ex="good";
	  break;
	  default:
		  ex="fail";
		  
	  
  
  
  
  
  }
 System.out.println("your grade is "+ ex);
 
		

	
	
	
	
	
	
	
	
	
	}

}
