package com.syntax.class30;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Task {

	public static void main(String[] args) {
		
	
	
	Map<String,String> countries= new TreeMap<>();
	countries.put("USA", "D.C");
	countries.put("France", "Paris");
	countries.put("Italy", "Rome");
	countries.put("Germany", "Berlin");
	
	System.out.println("=== Get Key Advanced for Loop===");
	for(String count:countries.keySet()) {
		System.out.println(count+countries.get(count));
	}
	System.out.println("=== Get KeyIterator ===");
	Iterator<String> KeyIt= countries.keySet().iterator();
	while(KeyIt.hasNext()) {
		System.out.println(KeyIt.next());}
		
		System.out.println("===Get Value Advanced for loop===");
		for(String val:countries.values()) {
			System.out.println(val);
		}
		
		
		
		
	
	
		System.out.println("===ALL Entries through Set===");
	//Storing all objects into set
	Set<Entry<String,String>>allEntries=countries.entrySet();
	System.out.println(allEntries);
	
	System.out.println("ALL Entries through For Loop DIANA'S WAY===");
	//for loop through all entries
	for(Entry<String ,String>entr:allEntries) {
		String key=entr.getKey();
		String value=entr.getValue();
		System.out.println(key+" ==="+value);
	}
	
	System.out.println("=== Iterating through all entries to get key and value===");
	Iterator<Entry<String,String>> entryIt=allEntries.iterator();
	while(entryIt.hasNext()) {
		Entry<String,String> e=entryIt.next();
		String key$value=e.getKey()+":::"+e.getValue();
		System.out.println(key$value);
	}
	
	
	
	
	}
}
