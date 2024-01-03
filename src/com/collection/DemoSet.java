package com.collection;

import java.util.HashSet;
import java.util.TreeSet;

public class DemoSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs = new HashSet<>();
		hs.add(1);
		hs.add(1);//Duplicate
		hs.add(2);
		hs.add(3);
		hs.add(5);
		
		//Listing out the object in the collection
		System.out.println(hs);
		
		HashSet<String> h2 = new HashSet<>();
		h2.add("java");
		h2.add("spring");
		h2.add("axios");
		h2.add("java");
		h2.add("java");
		h2.add("11");
		
		System.out.println("Simple Hash Set");
		System.out.println(h2);
		
		TreeSet<String> ts = new TreeSet<>(h2);	//Guarantees Order
		System.out.println(ts);
		
	}

}
