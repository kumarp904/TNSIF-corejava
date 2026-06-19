package com.tnsif.lambdaexpression;
// demo for without lambda expression

import com.tnsif.inheritanceprogram.Maindemo;

@SuppressWarnings("unused")
@FunctionalInterface
interface Drwable{
	public void draw();//abstract method
}
class Test implements Drwable{
	int width=10;
	
	@Override
	public void draw() {
		System.out.println("drawing	"+width);
	}
}

public class WithoutLambda {
public static void main(String[] args) {
	Drwable d=new Test();
	d.draw();
}
}
