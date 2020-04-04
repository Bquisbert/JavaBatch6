package com.syntax.class21;

public class UserInfo extends UserClass {
String adressInfo;
	UserInfo(String name,String adressInfo,int mobile){
		super(name,mobile);
		this.adressInfo=adressInfo;
	}
	void display() {
		System.out.println(name+" "+mobile+" "+adressInfo);
	}
	
	
	
	public static void main(String[] args) {
		
		UserInfo obj=new UserInfo("brian", "New brook dr", 896394);
		
		obj.display();
		
		
		
		
		
		
	}
	
}
