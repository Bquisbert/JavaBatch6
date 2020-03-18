package com.syntax.class04;

public class Nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  boolean flag=true;
		  boolean classToday=true;
		  
		  if (flag) {System.out.println("hello");
		  if (classToday) {System.out.println("hello friends");}
		  else  {System.out.println("hello family");}
		  
			    }
		    else {System.out.println("bye");}
		  
		  System.out.println("i am outside of if condition");
		  
		  //-------------------------------------------------------
		  
		  //declare date and day
		  //if day is friday --> if date is 13th--> watch scary movie
		  //                 -->   if date is not 13--> watch a comedy
		  
		  boolean isFriday=false;
		  int date=13;
		  
		  if (isFriday) {System.out.println("it is friday, i am going to the movies");
		if (date==13) {System.out.println("ill watch scary movie");	 }
		else {System.out.println("ill watch comedy");}
		
		  
		  }else {System.out.println("today is not friday i am staying home");}
				  
		  
		  

	
	
	
	
	
	
	
	
	
	}

}
