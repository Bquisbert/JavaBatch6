package com.syntax.class34;

public class task2 {
	public static void checkUserName(String userName) {
		if (userName.length() < 5) {
			throw new StringIndexOutOfBoundsException("Must contain more than 5 characters");
		}else {
			System.out.println(userName+": is valid");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkUserName("bquisbert");
	}

}
