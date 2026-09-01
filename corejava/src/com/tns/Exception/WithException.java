package com.tns.Exception;

public class WithException {
public static void main(String[] args) {
	System.out.println("I am Manu");
	int a=10;
	int b=0;
	
	System.out.println("I am solving Exception");
	try {
		System.out.println(a/b);
	}
	catch(Exception x) {
		System.out.println(x);
	}
	System.out.println("I solved Exception");
}
}
