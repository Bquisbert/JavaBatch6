package com.syntax.class23;

public class Computer {
public void keyboard() {
	System.out.println("I have a keyboard");
}
public void screen() {
	System.out.println("I have a screen");
}
public void logo() {
	System.out.println("i have a logo");
}
String brand;

Computer(String brand){
	this.brand=brand;
}
public void display() {
	System.out.println("I have "+brand);
}
}
class Apple extends Computer{
	Apple(String brand){
		super(brand);
	}
	public void logo() {
		System.out.println("My logo is an Apple!");
	}
}
class Lenovo extends Computer{
	Lenovo(String brand){
		super(brand);
	}
	public void logo() {
		System.out.println("My logo is a T");
	}
}
class Hp extends Computer{
	Hp(String brand){
		super(brand);
	}
 public void logo() {
	 System.out.println("My logo is Hp");
 }
}
class Dell extends Computer{
	Dell(String brand){
		super(brand);
	}
	public void logo() {
		System.out.println("My logo is DELL");
	}
}