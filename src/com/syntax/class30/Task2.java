package com.syntax.class30;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> bestBuy= new LinkedHashMap<>();
		
		bestBuy.put(1304451, "Printer");
		bestBuy.put(523525, "TV");
		bestBuy.put(235656, "PlayStation 5");
		bestBuy.put(31498752, "Home projector");
		
		Set<Entry<Integer,String>> bestEntries=bestBuy.entrySet();
		
		Iterator<Entry<Integer,String>> bestIt=bestEntries.iterator();
		while(bestIt.hasNext()) {
			Entry<Integer,String> b=bestIt.next();
			String Key$Value=b.getKey()+"="+b.getValue();
			System.out.println(Key$Value);
		}
		
		
		
		
		
		
		
		
		
	}

}
