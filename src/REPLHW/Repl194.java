package REPLHW;

import java.util.LinkedHashSet;
import java.util.Set;

public class Repl194 {

	String name;
	String lastName;
	int id;

	Repl194(String name, String lastName, int id) {
		this.name = name;
		this.lastName = lastName;
		this.id = id;
	}

	void display() {
		System.out.println("Student details: " + name + " " + lastName + " with id: " + id);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Create a Repl194 class that will have 
//		variables as studentId, name and lastName
//		constructor
//		method to display students details
//
//		Create a set that will store 5 different students in an order they been added to the collection.
//
//		Execute method to display students details

		
		//i made a set of constructors for this problem

		Set<Repl194> mm = new LinkedHashSet<>();
		mm.add(new Repl194("Samir", "Jawid", 101));
		mm.add(new Repl194("Asel", "Umurzakova", 102));
		mm.add(new Repl194("Diego", "Juarez", 103));
		mm.add(new Repl194("Sohil", "Aryan", 104));
		mm.add(new Repl194("Alijon", "Nazarov", 105));

		for (Repl194 m : mm) {
			m.display();
		}

	}

}
