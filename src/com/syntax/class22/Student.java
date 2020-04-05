package com.syntax.class22;

public class Student {
	void study() {
		System.out.println("I study alot");
	}

	void notes() {
		System.out.println("I take notes about");
	}
	
	
}

class SyntaxStudent extends Student {

	void notes() {
		System.out.println("I take notes about java");
	}

	void test() {
		System.out.println("I am a Tester");
	}
}

class College extends Student {
	void notes() {
		System.out.println("I take notes about History");
	}

	void sched() {
		System.out.println("I have crazy schedule");
	}
}

class School extends Student {

	void notes() {
		System.out.println("I take notes about health/P.E");
	}

	void bus() {
		System.out.println("I wait for the school bus");
	}

}
