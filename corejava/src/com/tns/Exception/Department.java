package com.tns.Exception;

public class Department {
public static void main(String[] args) {
	String employeename="Manoj";
	String department=null;
	String role="software Developer";
	try {
		System.out.println("empname :" +employeename);
		System.out.println("Role :"+role);
		System.out.println("department :"+department.toUpperCase(null));
	}
	catch(NullPointerException n) {
		System.out.println("Department infromation is missing");
		System.out.println(n);
	}
	System.out.println("Program ends...");
}
}
