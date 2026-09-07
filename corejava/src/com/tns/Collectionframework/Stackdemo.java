package com.tns.Collectionframework;
import java.util.Stack;
public class Stackdemo {
@SuppressWarnings("unused")
public static void main(String[] args) {
	Stack<Integer> s=new Stack<>();
	
	s.push(56);
	s.push(22);
	s.push(11);
	s.push(1);
	System.out.println(s);
	
	s.pop();
	System.out.println(s);
     
	s.peek();
	System.out.println(s);
	
	s.empty();
	System.out.println(s);
	
	s.search(1);
	System.out.println(s);
	
	for(Integer n:s) {
		System.out.println(s);
	}
	System.out.println(s.search(1));
	
}
}
