package com.syntax.class25;

public class WebDriverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirefoxDriver mm=new FirefoxDriver();
		mm.openBrow();
		mm.closeBrow();
		mm.maxWin();
		mm.findEl();
		
		System.out.println("===============");
		
		ChromeDriver mm1=new ChromeDriver();
		mm1.openBrow();
		mm1.closeBrow();
		mm1.maxWin();
		mm1.findEl();
		
	}

}
