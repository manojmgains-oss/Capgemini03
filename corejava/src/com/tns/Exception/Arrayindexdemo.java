package com.tns.Exception;

public class Arrayindexdemo {
public static void main(String[] args) {
	int marks[]= {80,12,33,22};
	try {
		System.out.println(marks[0]);
		System.out.println(marks[2]);
		System.out.println(marks[6]);
		System.out.println("hi Bro");
	}
	catch(ArrayIndexOutOfBoundsException a) {
		System.out.println(a);
	}
	System.out.println("Counting starts...");
}
}
