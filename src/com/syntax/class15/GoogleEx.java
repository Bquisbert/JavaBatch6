package com.syntax.class15;

public class GoogleEx {

		//define features such as emp id,name,last name,salary,title
	//define a behavior working,get paid,attending meeting
		
		int empId;
		double salary;
		String name, lastName, title;
		
		void working(){
			System.out.println(title+ " is working");
		}
		
		void getPaid() {
			System.out.println(name + " is getting paid "+ salary);
		}
		
	    void attendMeeting() {
	    	System.out.println(name+ " attending metting ");
	    }
	    
	    public static void main(String[] args) {
			
	    	
	    	GoogleEx emp1=new GoogleEx();
	    	emp1.empId=0755;
	    	emp1.name="John";
	    	emp1.lastName="Smith";
	    	emp1.title="CEO";
	    	emp1.salary=160000;
	    	
	    	emp1.working();
	    	emp1.getPaid();
	    	emp1.attendMeeting();
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
		}

}
