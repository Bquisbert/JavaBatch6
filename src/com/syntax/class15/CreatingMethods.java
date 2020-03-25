package com.syntax.class15;

public class CreatingMethods {

//create a method that will accept marks
	// based on marks it will return grade{A,B,C}
	char grades(int mark) {
		char grade;
		if (mark > 90) {
			grade = 'A';
		} else if (mark < 90 && mark > 80) {
			grade = 'B';
		}else {
			grade='F';
		}

		return grade;
	}

public static void main(String[] args) {
	
	


	CreatingMethods obj=new CreatingMethods();


 char gradess=obj.grades(99);

System.out.println(gradess);

if(gradess== 'A'|| gradess=='B') {
	System.out.println(" Good job");
}else {
	System.out.println("go study more loser!");
}

System.out.println(obj.grades(99));


}



}
