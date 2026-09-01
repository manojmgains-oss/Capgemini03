package com.tns.Exception;

public class Arthamaticexception {
public static void main(String[] args) {
	int salary=50000;
	int workingdays=7;
	int bonusday=4;
	try {
		int dailysalary=salary/workingdays;
		System.out.println("salary :"+dailysalary);
		
		int bonusperday=salary/0;
		System.out.println("bonus :"+bonusperday*bonusday);
	}
	catch(ArithmeticException a) {
		System.out.println("cant calaculate salary bonus...");
		System.out.println(a);
	}
	System.out.println("salary processing completed");
	
}
}
