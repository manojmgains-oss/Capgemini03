package com.tns.Exception;

public class Finallydemo {
public static void main(String[] args) {
	try {
	System.out.println(2/0);
	}
	catch(ArrayIndexOutOfBoundsException f) {
		System.out.println("Process complete");
	}
	finally {
		System.out.println("Iam finally block");
	}
}
}
