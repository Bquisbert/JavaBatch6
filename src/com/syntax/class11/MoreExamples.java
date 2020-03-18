package com.syntax.class11;

public class MoreExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create 2d arrys in which we store proffesions

		String[][] professions = { 
				{ "QA Tester", "Developers", "Product Owner", "Scrum Master" },
				{ "Math Teacher", "Science Teacher", "English Teacher" }, 
				{ "Dentist", "surgeon" }

		};
// get elements using advanced for loop
		
		for(String[] occupation:professions) {
			
			for(String title:occupation) {
				System.out.print(title+" ");
			}
		System.out.println();
		}
		
		
		
		
	}

}
