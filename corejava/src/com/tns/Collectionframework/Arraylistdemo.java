package com.tns.Collectionframework;
import java.util.ArrayList;
public class Arraylistdemo {
public static void main(String[] args) {
	
	//object creation
	
	ArrayList<String> p=new ArrayList<>();
	
	p.add("Laptop");
	p.add("Mobile");
	p.add("Coco");
	p.add(null);
	p.add("PC");
	p.add("PC");
	p.add("PC");

	System.out.println(p);
	System.out.println("Product 1:" +p.get(1));
	System.out.println("contains mobile? " +p.contains("Mobile"));
	
	System.out.println(p.size());
	p.remove("Coco");
	System.out.println(p);
	
//	for(String i:p) {
//		System.out.println(i);
//	}
	
}
}
