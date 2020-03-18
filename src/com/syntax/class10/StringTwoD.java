package com.syntax.class10;

public class StringTwoD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] months = { { "january", "february", "march" }, 
				{ "march", "april", "may" },
		          {"june","july","august"},
		          {"september","october","november"},
		          {"december"}

		};
 
//		 int rows=months.length;
//		 int firstArray=months[0].length;
//		 System.out.println(firstArray);
//		 
		 for(int i=0;i<months.length;i++) {//itterates rows
			 
			 for(int j=0;j<months[i].length;j++) {//itterates columns
				 System.out.println(months[i][j]);
			 }
		 }




	}

}
