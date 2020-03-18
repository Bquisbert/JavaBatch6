package com.syntax.class07;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*for loop
	 *  good morning 5 times
	 * 
	 */
	
	// see what is going on in code better
	for(int c=1; c<6; c++) {
		System.out.println("good morning");
	}
	
	
	//1 to 10
	for (int i=1; i<=10; i++) {
		System.out.println(i);
	}
	//10 to 1
	for (int i=10; i>=1; i--) {
		System.out.println(i);
	}
	// adding 5
	for(int i=0; i<=50; i+=5) {
		System.out.println(i);
	}
	
	int sum=0;
	for(int i=1; i<5; i++) {
		sum=sum+i;
	}
	System.out.println(sum);
	
	}

}
