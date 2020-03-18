package REPLHW;

public class Repl72 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Write a program that creates an array with the following values{s, a, y,  b, n, c, t,  d, a, e, x} 
//		Print the values so the output should look like below
//
//		Output:
//		syntax
	
		
		char[] syn={'s','a', 'y',  'b', 'n', 'c', 't',  'd', 'a', 'e', 'x'};
		
		for(int i=0;i<syn.length;i++) {
			if(i%2==0) {
				System.out.print(syn[i]);
			}
		}
		
	//	System.out.println(syn[0],syn[2],syn[4],syn[6],syn[8],syn[10]);
	
	}

}
