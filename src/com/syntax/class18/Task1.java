package com.syntax.class18;

public class Task1 {
	String name;
	int grade;
	int grade2;
	int grade3;

	void avg() {
		int d;
		d = (grade + grade2 + grade3) / 3;
		System.out.println("Student " + name + " average grade is " + d);

	}

	  protected Task1(String studentName, int gradeone, int gradeTwo, int gradeThree){
		name = studentName;
		grade = gradeone;
		grade2 = gradeTwo;
		grade3 = gradeThree;
	}

	public static void main(String[] args) {

		Task1 stu = new Task1("Brian", 99, 89, 97);
		stu.avg();

		Task1 stu2 = new Task1("Sarmed", 99, 97, 89);
		stu2.avg();

		Task1 stu3 = new Task1("Mahady", 99, 99, 99);
		stu3.avg();

		Task1 stu4 = new Task1("Tetteh", 92, 95, 98);
		stu4.avg();

		Task1 stu5 = new Task1("Mikhel", 95, 95, 95);
		stu5.avg();

	}

}
