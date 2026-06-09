package com.tnsif.stringprograms;
// demo for equals method
public class Equalsdemo {
	public static void main(String[] args) {
		String s1="DK";
		String s2="DK";
		String s3=new String("DK");
		String s4="harisha";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s2.equals(s4));
	}

}
