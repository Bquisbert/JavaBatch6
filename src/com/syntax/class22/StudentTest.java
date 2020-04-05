package com.syntax.class22;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student mm1 = new Student();
		mm1.study();
		mm1.notes();

		Student mm2 = new SyntaxStudent();
		mm2.study();
		mm2.notes();// Run Time polymorphism

		Student mm3 = new College();
		mm3.study();
		mm3.notes();// Run time polymorphism

		Student mm4 = new School();
		mm4.study();
		mm4.notes();// Run time polymorphism

	}

}
