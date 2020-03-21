package com.syntax.class14;

public class Dogs {

	
	
	String breed;
	String color;
	String name;
	int age;
	public static void main(String[] args) {
		Dogs dog1= new Dogs();
		dog1.breed="Shih tzu";
		dog1.color="Yellow";
		dog1.name="Lucy";
		dog1.age=3;
	
	
	
	
	Dogs dog2= new Dogs();
	
	dog2.breed="Pitbull";
	dog2.color="gold";
	dog2.name="Simba";
	dog2.age=14;
	
	dog2.eat();
	dog2.bark();
	dog2.run();
	
	
	}
	
	//outside main method
	void eat(){
		System.out.println(name+" can eat");
	}
	void bark() {
		System.out.println(name+" can bark");
	}
	void run() {
		System.out.println(name+" can run");
	}
	

	
	
	
	
	
	
	
	}

	
	
	
	


