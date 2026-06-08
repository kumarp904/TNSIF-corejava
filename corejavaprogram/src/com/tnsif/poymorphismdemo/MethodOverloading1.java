package com.tnsif.poymorphismdemo;
// demo for method overloading

class Calculator1{
int calculation(int a,int b) {
		return a*b;
		
	}
	int calculation1(int c,int d) {
		return c/d;
		
	}
	int calculation(int a,int b,int K) {
		return a+b-K;
		
	}
}
public class MethodOverloading1 {
public static void main(String[] args) {
	Calculator1 c=new Calculator1();
	System.out.println(c.calculation(5,4));
	System.out.println(c.calculation1(8, 8));
	System.out.println(c.calculation(10, 2, 2));
}
}
