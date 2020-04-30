package REPLHW;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
	private String fullName;
	private int ssn;
	private double salary;

	Main(String fullName, int ssn, double salary) {
		this.fullName = fullName;
		this.ssn = ssn;
		this.salary = salary;
	}

	public String getName() {
		return (fullName);
	}

	public int getSocial() {
		return (ssn);
	}

	public double getSalary() {
		return (salary);
	}

	public static void main(String[] args) {

//		Create an Employee class that will be fully encapsulated and will have:
//			variables as FullName, ssn and salary
//			constructor to initialize instance variables
//			getters to have an access to instance variables
//
//			Create a set collection that will store # objects of Employee type and using Iterator print the value of each variable
//
//			Expected Output:
//			John Doe
//			123456789
//			80000.0
//			Jane Smith
//			987654321
//			90000.0
//			Jackie Chan
//			0
//			1000000.0

		Set<Main> emp = new LinkedHashSet<>();
		emp.add(new Main("John Doe", 123456789, 80000.0));
		emp.add(new Main("Jane Smith", 987654321, 90000.0));
		emp.add(new Main("Jackie Chan", 0, 100000.0));

		Iterator<Main> it = emp.iterator();
		while (it.hasNext()) {
		Main e1=it.next();
		System.out.println(e1.fullName);
		System.out.println(e1.ssn);
		System.out.println(e1.salary);
			
		}

	}

}
