package REPLHW;

import java.util.Scanner;

public class repl78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
	    int[]num=new int[5];
	    for(int i=0;i<num.length;i++){
	      num[i]=scan.nextInt();
	    }	
	    
	    for(int j=0;j<num.length;j++){
	      System.out.println(num[j]*10);
	    }
	}

}
