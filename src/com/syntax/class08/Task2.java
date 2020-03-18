package com.syntax.class08;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//print numbers from 1-20
		// skip 5,6,7
		
		
		for (int i = 1; i < 21; i++) {
			if (i == 5 || i == 6 || i == 7) {
				continue;
			}
			System.out.println(i);
		}

	}

}
