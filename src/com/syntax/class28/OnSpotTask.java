package com.syntax.class28;

import java.util.Iterator;
import java.util.LinkedList;

public class OnSpotTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> llist=new LinkedList();
		
		llist.add("Brian");
		llist.add("Mahady");
		llist.add("Sarmed");
		
		Iterator<String> names=llist.iterator();
		while(names.hasNext()) {
			String name=names.next();
			System.out.println(name);
		}
		
		for(int i=0;i<llist.size();i++) {
			System.out.println(llist.get(i));
		}
		
		
		for(String l:llist) {
			System.out.println(l);
		}
		
		
	}

}
