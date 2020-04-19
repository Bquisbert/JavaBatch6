package REPLHW;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Repl179 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Create an arrayList of type Integer. 
//
//		add below values. 
//		111
//		111
//		111
//		999
//		999
//		999
//
//		Print all the values of List 1 by 1:
//
//		Expected Output:
//		111
//		111
//		111
//		999
//		999
//		999

		List<Integer> numbers = new ArrayList<>();

		numbers.add(111);
		numbers.add(111);
		numbers.add(111);
		numbers.add(999);
		numbers.add(999);
		numbers.add(999);

		Iterator<Integer> it = numbers.iterator();

		while (it.hasNext()) {
			int num = it.next();
			System.out.println(num);
		}

	}

}
