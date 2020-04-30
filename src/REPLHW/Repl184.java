package REPLHW;

import java.util.LinkedList;
import java.util.List;

public class Repl184 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		Create Linked List that will store first 10 numbers of fibonacci series
//
//		Print number from Linked List 1 by 1 all in 1 line
//
//		Expected Output:
//		0 1 1 2 3 5 8 13 21 34 

		List <Integer>fib=new LinkedList<>();
		fib.add(0);
		fib.add(1);
		fib.add(1);
		fib.add(2);
		fib.add(3);
		fib.add(5);
		fib.add(8);
		fib.add(13);
		fib.add(21);
		fib.add(34);
		
		System.out.print(fib);
		
		
	}

}
