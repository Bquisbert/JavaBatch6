package com.syntax.class25;

public interface Trustable {

	//default compiler adds public and abstract
	void trust();
}
interface Bank extends Trustable{
	//by default compiler adds public and abstract
	void deposit();
	void withdraw();
}
class BOA extends Finance implements Bank, CreditUnion{

	@Override
	public void trust() {
System.out.println("BOA is trustable");		
	}

	@Override
	public void deposit() {
		System.out.println("you can make deposit at BOA");
	}

	@Override
	public void withdraw() {
		System.out.println("you can with draw at BOA");
	}

	@Override
	public void giveCredit() {
System.out.println("BOA gives credit");		
	}
	
}
interface CreditUnion{
	//by default compiler adds public and abstract
	void giveCredit();
}
class Finance{
	public void financing() {
		System.out.println("We deal with financing");
	}
}

