package com.syntax.class05;

public class LogicalAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*if declared number is
 * between 1-10 ---> small number
 * between 11-100--> big number
 * between 101-1000--> large number
 */
		
		
		int num=1178;
		
		if(num>=1&& num<=10) {
			System.out.println("small number");
		}else if (num>10 && num<=100) {
			System.out.println("big number");
		}else if (num>100 && num<=1000) {
			System.out.println("large number");
		}else {
			System.out.println("super large number");
		}

	
	
	
	
	}

}
