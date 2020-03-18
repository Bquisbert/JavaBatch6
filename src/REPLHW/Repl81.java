package REPLHW;

public class Repl81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	
//		Write a program that prints the highest value in the array.
//
//		Expected Output:
//		8
	
	
		int[][] a = {
				{5,2,3,7},
				{1,5,1,1,},
				{8,3,1,2}
			};
	
	int largest=a[0][0];
	
	
	for(int i=0;i<a.length;i++) {
	for(int k=0;k<a[i].length;k++) {
		if(a[i][k]>largest) {
			largest=a[i][k];
			
		}
	}
		
}
	

	System.out.println(largest);
	}

}
