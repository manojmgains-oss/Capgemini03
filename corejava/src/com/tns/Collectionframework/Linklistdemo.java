package com.tns.Collectionframework;

import java.util.LinkedList;

public class Linklistdemo {
public static void main(String[] args) {
	LinkedList<String> h=new LinkedList<>();
	
	h.add("Youtube");
	h.add("Google");
	h.add("Github");
	h.add("Insta");
	System.out.println(h);
	
	h.addFirst("LinkedIN");
	h.addLast("Free fire");
	
	System.out.println("First :" +h.peekFirst());
	
	System.out.println("Remove :" +h.peekLast());
	System.out.println(h);
}
}
