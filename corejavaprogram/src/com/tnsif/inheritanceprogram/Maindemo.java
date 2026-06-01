package com.tnsif.inheritanceprogram;
//demo for inheritance
class Father{
	int money=90000;
	String car="rolls royce";
	
	void drinking() {
		System.out.println("tea");
	}
}
class Son extends Father{
	String cycle="green";
	
	void read() {
		System.out.println("java");
	}
}
public class Maindemo {
public static void main(String[] args) {
	Father f=new Father();
	f.drinking();
	Son s=new Son();
	System.out.println(s.money);
	System.out.println(s.car);
	s.drinking();
	System.out.println(s.cycle);
	s.read();
}
}
