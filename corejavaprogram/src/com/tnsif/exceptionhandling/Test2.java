package com.tnsif.exceptionhandling;
//without exception
public class Test2 {
	public static void main(String[] args) {
		try {
			System.out.println("hello mam");
		}
		catch(Exception c) {
			System.out.println(c.getMessage());
		}
		finally {
			System.out.println("hello goodmorning");
		}
	}

}
