package com.syntax.class18;

public class ConstructorsDemo {

	static String str="hello";
	
	
	ConstructorsDemo(){
		System.out.println("I am your constructor");
		System.out.println("I am non argument constructor");
	}
	
	ConstructorsDemo(String str){
		System.out.println("I am a constructor with 1 string parameter "+str);
	}
	
	ConstructorsDemo(int num){
		System.out.println("I am constructor with 1 interger value="+num);
	}
	
	ConstructorsDemo(String str,int num){
		System.out.println("I am constructor with 2 parameter "+str+" & "+num);
	}
	
	void ConstructorsDemo() {
		System.out.println("I dont know who I am");
	}
	
	public static void main(String[] args) {
		
		
		ConstructorsDemo obj=new ConstructorsDemo();
		
		
		System.out.println(str);
		
		ConstructorsDemo obj1=new ConstructorsDemo("yes",13);		
	
	          obj1.ConstructorsDemo();
	
	}
	
	
	
	
	
	
}
