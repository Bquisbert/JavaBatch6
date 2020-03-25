package REPLHW;

public class Repl101 {

//	Create a class 'Main' (please do not make it public as Repl will give you an error)
//	Inside class String variable 'name' and integer variable 'roll_no'. 
//
//	Creating an object of the class and assign the value of 2 to roll_no and value of "John" to name
//
//	Your program should print the following:
//	Name is John and roll number is 2
	
	String name="John";
	
	int roll_no=2;
	
	public static void main(String[] args) {
		Repl101 obj=new Repl101();
		
		
		
		System.out.println("Name is "+obj.name+ " and roll number is "+ obj.roll_no);
	}
	
	
}
