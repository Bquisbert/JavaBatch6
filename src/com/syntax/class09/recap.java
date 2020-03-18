package com.syntax.class09;

public class recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// nested loops to print from 10-99
		for (int i = 1; i <= 9; i++) {
			for (int y = 0; y <= 9; y++) {
				System.out.println(i + "" + y);
			}
		}

		for (int i = 0; i <= 23; i++) {

			for (int y = 1; y < 60; y++) {
				if(y<10) {
					System.out.println(i+":0"+y);
				}else {
					System.out.println(i + ":" + y);
				}

			}
		}

	}

}
