package com.tnsif.poymorphismdemo;
// demo for method overloading

class Calculator2{
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
public class Methods {
public static void main(String[] args) {
	Calculator2 c=new Calculator2();
	System.out.println(c.calculation(5,4));
	System.out.println(c.calculation1(9, (int) 4.5));
	System.out.println(c.calculation(10, 2, (int)1.5));
}
}
