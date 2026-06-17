package com.tnsif.collectionframework;

import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		
		tm.put(3, "C");
		tm.put(1, "A");
		tm.put(2, "B");
		
		System.out.println(tm);
	}

}
