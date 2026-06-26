package com.tnsif.collectionframework;

import java.util.TreeSet;
//demo for Treeset1
public class TreeSetMethod1 {
	public static void main(String[] args) {
		TreeSet<String> t = new TreeSet<String>();
		
		
		t.add("Kumar");
		t.add("Abhi");
		t.add("abhi");
		t.add("Praveen");
		
		//add(null)
		for(String name:t) {
		System.out.println(name);
	}
	}

}