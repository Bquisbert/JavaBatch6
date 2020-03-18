package REPLHW;

import java.util.Scanner;

public class Repl77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Create an array of integers that will store 5 elements taken from a user
//		Don't print any prompt message for the user
//		Then print out all the elements you have created in the first loop in reverse order. 
//
//		Example: 
//		Input: 
//		1
//		2
//		3
//		4
//		5
//		Output:
//		5
//		4
//		3
//		2
//		1
	Scanner scan=new Scanner(System.in);
	
		
		int[] num=new int[5];
		
		num[0]=scan.nextInt();
		num[1]=scan.nextInt();
		num[2]=scan.nextInt();
		num[3]=scan.nextInt();
		num[4]=scan.nextInt();
		
		
		for(int i=num.length-1;i>=0;i--) {
			System.out.println(num[i]);
		}
		
	
	
	
	
	}

}
