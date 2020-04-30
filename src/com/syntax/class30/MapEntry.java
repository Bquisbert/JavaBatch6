package com.syntax.class30;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Map<String, Integer>month=new LinkedHashMap<>();
		
		month.put("January",31);
		month.put("February",28);
		month.put("March", 31);
		
		//get all entries from map
		Set<Entry<String,Integer>>entries=month.entrySet();
		
		//loop through all entry objects
		for(Entry<String,Integer>e:entries) {
			System.out.println(e.getKey()+":"+e.getValue());
			//System.out.println(e); works as well
		}
		
		//iterate through all entry objects
		Iterator<Entry<String, Integer>> it=entries.iterator();
		
		while(it.hasNext()) {
			Entry<String,Integer> entry=it.next();
			System.out.println(entry.getKey()+"== Value "+entry.getValue());
		}
		
		
		
		
		
	}

}
