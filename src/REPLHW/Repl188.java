package REPLHW;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Repl188 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> countries = new LinkedList<>();
		countries.add("Armenia");
		countries.add("USA");
		countries.add("Kazakhstan");
		countries.add("Australia");
		countries.add("Pakistan");
		countries.add("Russia");
		countries.add("Azerbaijan");
		
		
		
		Iterator<String>it=countries.iterator();
		
		for(int i=0;i<countries.size();i++) {
			if(countries.get(i).contains("A")) {
				countries.remove(i);
			}
		}
			
		System.out.println(countries);

			
		
		
		
		
		
		
		
		
	}

}
