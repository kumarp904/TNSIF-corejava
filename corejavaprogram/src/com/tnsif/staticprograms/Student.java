package com.tnsif.staticprograms;
// demo for static method

public class Student {
	int rollno;
	String name;
	 static String College="Sairam ";
	
	//static method change value
	
	static void Change() { //
		//name="kumar";
		College="Sairam CS";
	}
	Student(int r, String n){
		rollno=r;
		name=n;
	}
	void display() {
		System.out.println(rollno +" "+name+" "+College);
	}
	public static void main(String[] args) {
		Student.Change();
		Student  s1=new Student (1,"kumar");
		Student  s2=new Student (2,"Harish");
		Student  s3=new Student (3,"jayanth");
		Student  s4=new Student (4,"nithin");
		
		s1.display();
		s2.display();
		s3.display();
		s4.display();
		
	}
}
