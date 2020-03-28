package REPLHW;

public class Repl123 {	
	
//	Create two methods:
//		The first method should be a non-static method that will print out the following message:
//		"Programming is amazing."
//
//		The second method should be a static method that will print out the following message:
//		"Java is awesome."
//
//		Execute both methods
//
//		Expected Output:
//		Programming is amazing.
//		Java is awesome.
	
	void print() {
		System.out.println("Programming is amazing.");
}
	
	static String b() {
		String bo="Java is awesome.";
	return bo;
	}
	
	public static void main(String[] args) {
		
	Repl123 obj=new Repl123();
	
	obj.print();
		
     System.out.println(obj.b());		
		
		
	}
	
}
