package com.tnsif.superkeyword;
// demo for super constructor 

class User1{
	User1(){
		System.out.println("user account created in SBI.");
	}
}
class AdminUser extends User1{
	AdminUser(){
		super();
		// calls user constructor 
		System.out.println("admin granted the acess to User ");
	}
}
public class Superwithconstructor {
public static void main(String[] args) {
	AdminUser a=new AdminUser();
}
}