package REPLHW;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Repl193 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Create a Set collection in which you want to preserve an order of inserted String Objects.
//		Add the below values 
//		null
//		Sohil 
//		Diego
//		Alijon
//		Asel
//		Sumair 
		
		
		Set<String>instructors=new LinkedHashSet<>();
		instructors.add(null);
		instructors.add("Sohil");
		instructors.add("Diego");
		instructors.add("Alijon");
		instructors.add("Asel");
		instructors.add("Sumair");
		
		
		for(String i:instructors) {
			System.out.println(i);
		}
		
		Iterator<String>it=instructors.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
