package REPLHW;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Repl189 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Create the HashSet with list of Integers add the below numbers for the list
//		111
//		111
//		111
//		999
//		999
//		999
//		 
//		Print elements one by one.
//
//		Expected Output
//		999
//		111
		
		
		Set<Integer>list=new HashSet<>();
		list.add(111);
		list.add(111);
		list.add(999);
		list.add(999);
		
		Iterator<Integer>it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
		
		
		
	}

}
