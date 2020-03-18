package com.syntax.class04;

public class NestingElseIfs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*if student completed the quiz we will check for the score
		 * if score >90 --->great job
		 *if score >80----->well done
		 *if score >70----->you could do better
		 *if student did not complete quiz---> not good do homework on time
		 */
	
		boolean quizCompleted=true;
		int score=86;
		
		if (quizCompleted) {
			System.out.println("lets check your score");
		
		if (score>90) {System.out.println("great job, you study alot");}
		
		else if (score>80) {System.out.println("well done");}
		
		else if (score>70) {System.out.println("you could have done better");}
		
		else {System.out.println("you failed");}
		
		}else {System.out.println("please do HW on time");}
		
		
		
		
		
		
		
		
		
		
		

	}

}
