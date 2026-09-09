package com.tns.Collectionframework;

import java.util.TreeSet;

public class Salarysystem {
public static void main(String[] args) {
	TreeSet<Integer> t=new TreeSet<>();
	
	t.add(20000);
	t.add(10000);
	t.add(30000);
	t.add(4000);
	
	System.out.println("Salary :" +t);
	
	System.out.println("Total Salary :" +t.size());
	
	System.out.println("Contains 10000?" +t.contains(10000));
	
	System.out.println("Lowest Salary :" +t.first());
	
	System.out.println(t.last());
	
	//below
	System.out.println(t.headSet(30000));
	
	//above
	System.out.println(t.tailSet(30000));
	
	//between
	System.out.println(t.subSet(1000, 20000));
	
}
}
