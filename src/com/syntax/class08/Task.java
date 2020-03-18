package com.syntax.class08;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int sumEven=0;
int sumOdd=0;
		
		
		for(int k=1; k<=99; k++) {
			
			if(k%2==0) {
				sumEven=sumEven+k;
			}else {
				sumOdd=sumOdd+k;
			}
		} 
		System.out.println("Sum of evens= "+sumEven);
		System.out.println("Sum of odds= "+sumOdd);
	
	
	
	
	
	
	
	}

}
