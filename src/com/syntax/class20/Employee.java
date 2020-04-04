package com.syntax.class20;

public class Employee {
static String company;
int empNum;
protected double salary;
void getPaid() {
	System.out.println("Employee wage= "+salary);
}
static void work() {
	System.out.println("Company is "+company);
}
}

 class ScrumTeam extends Employee{
	String ceremonies;
	
	void test() {
		System.out.println("I am a tester");
	}
	void empId() {
		System.out.println("My id is "+empNum);
	}
	void attendMeetings() {
		System.out.println(ceremonies);
	}
	
}