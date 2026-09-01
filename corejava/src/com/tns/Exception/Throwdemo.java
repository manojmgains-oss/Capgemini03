package com.tns.Exception;

public class Throwdemo {
static void checkAge(int age) {
	if(age<18) {
		throw new ArithmeticException("You are not Eligible to Drive");
	}
	System.out.println("You are Eligible to Drive");
}
public static void main(String[] args) {
	try {
		checkAge(18);
	}
	catch(ArithmeticException e) {
		System.out.println(e.getMessage());
	}
}
}
