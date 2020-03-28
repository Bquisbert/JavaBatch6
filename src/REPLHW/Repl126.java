package REPLHW;

public class Repl126 {
	static String thirdLetter(String s){
		String word="" ; 
		for(int i=0;i<s.length();i+=3){
//		    if(i%3==0) {
//		    	word=word+s.charAt(i);
	//	    }
			word=word+s.charAt(i);
		  }
		return word;
		}
	
	public static void main(String[] args){
		System.out.println(thirdLetter("hello there")); //"hltr"
		System.out.println(thirdLetter("technology")); //"thly"
	}
	
	
			
}
