package REPLHW;

public class Repl103 {
//	In this class, you should specify the following attributes: breed, name, color, and following behaviors: bark(), run(), play().
//	Create 3 different objects of it: Husky, Bulldog, Labrador with specific attributes and behaviors.
//
//	The output of the program should be as following:
//	 
//	Husky can bark
//	Husky can run
//	Husky can play
//	Bulldog can bark
//	Bulldog can run
//	Bulldog can play
//	Labrador can bark
//	Labrador can run
//	Labrador can play
//	
	
	String name;
	
	void bark() {
		System.out.println(name+ " can bark");
	}
	void run() {
		System.out.println(name+" can run");
	
	}
	void play() {
		System.out.println(name+" can play");
	}
	
	public static void main(String[] args) {
		
		
		
		Repl103 dog1=new Repl103();
		
		dog1.name="Husky";
		
		dog1.bark();
		dog1.run();
		dog1.play();
		
		Repl103 dog2=new Repl103();
		dog2.name="Bulldog";
		
		dog2.bark();
		dog2.run();
		dog2.play();
		
		
		
		
		Repl103 dog3=new Repl103();
		dog3.name="Labrador";
		dog3.bark();
		dog3.run();
		dog3.play();
		
	}
	
	
}
