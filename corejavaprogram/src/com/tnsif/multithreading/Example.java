package com.tnsif.multithreading;
// demo for synchronization
public class Example {
	
	synchronized void display() {
	Thread g=Thread.currentThread();
	for(int i=0;i<=3;i++) {
		try {
			Thread.sleep(5000);
			System.out.println(g.getName()+""+i);
		}
	catch(Exception e) {
	}
}
}
}