package REPLHW;

import java.util.ArrayList;
import java.util.List;

public class Repl180 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Create an Arraylist of type Integer. 
//		Add below elements to it. 
//		111
//		222
//		333
//		444
//		555
//		666
//		Print the ArrayList. 
//		remove all the elements. 
//		Print the Arraylist. 
		
		
		
		List<Integer> numbers=new ArrayList<>();
		
		
		numbers.add(111);
		numbers.add(222);
		numbers.add(333);
		numbers.add(444);
		numbers.add(555);
		numbers.add(666);
		
		System.out.println(numbers);
		
		
		
		numbers.removeAll(numbers);
		
	   System.out.println(numbers);
		
	}

}
