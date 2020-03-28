package REPLHW;

public class Repl121 {

//	Declare a static variable number that will hold an integer value:
//
//		Access number from the main method and assign value to it.
//		Create an Object of the class, access number in a nonstatic way and assing value of 200.
//
//		Print out number using class name and using instance
//
//		Expected Output:
//		200
//		200
	static int j;

	public static void main(String[] args) {

		j = 200;

		System.out.println(Repl121.j);
		Repl121 obj = new Repl121();
System.out.println(obj.j);
}

}
