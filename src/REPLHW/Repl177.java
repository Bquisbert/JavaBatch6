package REPLHW;

import java.util.ArrayList;

public class Repl177 {

//	Create an array list that will hold String Objects
//	Find out wether array list is empty or not. 
//	Add String value "Syntax" to it
//	Find out wether array list is empty or not. 
//
//	Expected Output:
//	true
//	false

	public static void main(String[] args) {
	
		ArrayList<String> Objects=new ArrayList<>();
		
		System.out.println(Objects.isEmpty());
		
		Objects.add("Syntax");
		
		System.out.println(Objects.isEmpty());
}
}
