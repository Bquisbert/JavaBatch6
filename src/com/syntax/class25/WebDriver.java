package com.syntax.class25;

public interface WebDriver {
void openBrow();
void closeBrow();
void maxWin();
void findEl();
}
class ChromeDriver implements WebDriver{

	@Override
	public void openBrow() {
System.out.println("Chrome can open browser");		
	}

	@Override
	public void closeBrow() {
System.out.println("Chrome can close browser");		
	}

	@Override
	public void maxWin() {
System.out.println("Chrome maximizes windows");		
	}

	@Override
	public void findEl() {
System.out.println("Chrome finds elements");		
	}
	
}
class FirefoxDriver implements WebDriver{
	@Override
	public void openBrow() {
System.out.println("Firefox can open browser");		
	}

	@Override
	public void closeBrow() {
System.out.println("Firefox can close browser");		
	}

	@Override
	public void maxWin() {
System.out.println("Firefox maximizes windows");		
	}

	@Override
	public void findEl() {
System.out.println("Firefox finds elements");

}
	
}
