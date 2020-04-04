package com.syntax.class22;

public class Degree {

	void getPre() {
		System.out.println("To get degree you need high school diploma ");
	}

	
}
class Bachelors extends Degree{
	
	void getPre() {
		System.out.println("To get a Bachelors you need a Degree");
	}
	

}
class Masters extends Degree{
	void getPre() {
		System.out.println("To get a Masters you need a Bachelors");
	}
}