package com.syntax.class30;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

abstract class Store{
	
	String type,name;
	
	public Store(String type,String name){
		this.name=name;
		this.type=type;
	}
	
	public abstract void workingHours();
	
	public void display() {
		System.out.println("this is Store "+name);
	}
}

class Nike extends Store{

	public Nike(String type, String name) {
		super(type, name);
		
	}
	public void workingHours() {
		System.out.println(name+" opens at 10 and closes at 6pm");
	}
	
}

class Costco extends Store{

	public Costco(String type, String name) {
		super(type, name);
		
	}
	
	public void workingHours() {
		System.out.println(name+" works from 8am to 8pm");
	}
	
	
}
class Amazon extends Store{

	public Amazon(String type, String name) {
		super(type, name);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public void workingHours() {
		System.out.println(name+" works 24/7");
	}
	
}

public class UserDefineClassesInMap {
	
	
	public static void main(String[] args) {
		
		
		// we want to store Stores in form === Amazon ,CostCo,Nike
		
		Map<Integer,Store> storeMap=new LinkedHashMap<>();
		storeMap.put(1, new Amazon("online","Amazon"));
		storeMap.put(2, new Costco("WholeSale","CostCo"));
		storeMap.put(3, new Nike("Retail","Nike"));
		
		System.out.println(storeMap);
		
		//get acess to all METHODS of our store objects: .values(),.KeySet(),entrySet()
		
		//1.way -----> get all value OBJECTS
		Collection<Store>col=storeMap.values();
		for(Store store:col) {
			store.workingHours();
			store.display();
			System.out.println("======");
		}
		
		
		System.out.println("---USING ENTRY SET----");
		//2.way get all Entry Objects----> getValue
		
		Set<Entry<Integer,Store>>storeSet=storeMap.entrySet();
		for(Entry<Integer,Store> entry:storeSet) {
			entry.getValue().display();
			entry.getValue().workingHours();
			System.out.println("=======");
		}
		
		
		//3.way ---->get all keys --->get Value of specified key
	Set<Integer> keys=storeMap.keySet();
		 for(Integer key:keys) {
			Store obj= storeMap.get(key);
			 obj.display();
			 obj.workingHours();
			 System.out.println("====");
		 }
		
	}

}


