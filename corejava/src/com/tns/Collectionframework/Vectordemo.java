package com.tns.Collectionframework;

import java.util.Vector;

public class Vectordemo {
public static void main(String[] args) {
	Vector<Integer> v=new Vector<>();
	
	v.add(1);
	v.add(2);
	v.add(3);
	v.add(22);
	System.out.println(v);
	
	v.capacity();
	System.out.println(v);
	
	v.contains(4);
	System.out.println(v);
	
	v.removeFirst();
	System.out.println(v);
	
	for(@SuppressWarnings("unused") int h:v) {
		System.out.println(v);
	}
	v.clear();
	System.out.println(v);
}
}
