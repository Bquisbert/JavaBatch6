package REPLHW;

import java.util.Set;
import java.util.TreeSet;

public class Repl192 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Create Set to store String Objects and you want them to be stored in ascending order
//		Please add the below values and see the result 
//		"India"
//		"Australia"
//		"South Africa"
//		"India"
//		"America"
//		"America"
//
//		Print the Set. 
//
//		Expected Output: 
//		[America, Australia, India, South Africa]
		
		Set<String>count=new TreeSet<>();
		count.add("India");
		count.add("Australia");
		count.add("South Africa");
		count.add("India");
		count.add("America");
		count.add("America");

		System.out.println(count);
		
		
		
		
		
	}

}
