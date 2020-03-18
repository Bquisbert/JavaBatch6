package REPLHW;

import java.util.Scanner;

public class Repl34 {
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		

		System.out.println("Please enter First Number");
		int firstNum =scan.nextInt();
		System.out.println("Please enter 2nd Number");
		int secondNum = scan.nextInt();
		System.out.println("Please enter 3rd Number");
		int thirdNum = scan.nextInt();
		int number;

		if (firstNum > secondNum && firstNum> thirdNum) {
			number = firstNum;
		} else if (secondNum > firstNum && secondNum > thirdNum) {
			number = secondNum;
		} else {
			number = thirdNum;
		}

		System.out.println("The largest number is " + number);

	}
		

	
	
	
	
	
	
	
}


