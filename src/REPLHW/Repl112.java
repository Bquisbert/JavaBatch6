package REPLHW;

public class Repl112 {
	
//	Create a method that will accept 2 numbers as parameters and return true if both numbers are even otherwise returned false
//			( Return false if one or both given numbers are not even)
//
//			Examples:
//			bothEven(4,6) ==> true
//			bothEven(3,4) ==> false
//			bothEven(-1,1) ==> false
//
//			Expected Output:
//			false
 
	void even(int a, int b) {
		if (a%2==0 && b%2==0) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
	
	
	public static void main(String[] args) {
		
		Repl112 mm=new Repl112();
		
		mm.even(4, 7);
		
		
	}
	
	
	
}
