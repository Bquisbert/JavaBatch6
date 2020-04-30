package REPLHW;

import java.util.HashSet;
import java.util.Set;

public class Repl190 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Create a Set and and below values to it. 
//		[third, first, second]
//
//		Print HashSet and then remove all the elements from Hashset and print it again.
//
//		Expected Output:
//		[third, first, second]
//		[]
		
		
		Set<String>n=new HashSet<>();
		n.add("third");
		n.add("first");
		n.add("second");
		
		System.out.println(n);
		
		n.removeAll(n);
		System.out.println(n);
		
		
		
		
		
		
		
	}

}
