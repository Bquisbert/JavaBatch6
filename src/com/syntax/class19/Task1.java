package com.syntax.class19;

public class Task1 {

	String name,adress;
	
	Task1(String name,String adress){
		this.adress=adress;
		this.name=name;
	}
	
	void display() {
		System.out.println(this.adress+" is my adress and my name is "+this.name);
	}
	
	public static void main(String[] args) {
		
		Task1 obj=new Task1("Brian","1234 New brook dr");
		
		obj.display();
		
		
	}
	
	
	
	
}
