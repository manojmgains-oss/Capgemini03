package com.tns.Exception;

public class Throwsdemo {
static void checkpassword(String Password) {
	if(Password.length()<6) {
		throw new IllegalArgumentException("Password is too short");
	}
	System.out.println("Password Accepted");
}
public static void main(String[] args) {
	try {
		checkpassword("abaaaas");
	}
	catch(IllegalArgumentException e) {
		System.out.println(e.getMessage());
	}
}
}
