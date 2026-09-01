package com.tns.Exception;

public class Stringindexdemo {
public static void main(String[] args) {
	String name="MANU";
	try {
		System.out.println(name.charAt(0));
		System.out.println(name.charAt(3));
		System.out.println(name.charAt(6));
		System.out.println("Hi BRO");
	}
	catch(Exception x) {
		System.out.println(x);
	}
	System.out.println("Program starts...");
}
}
