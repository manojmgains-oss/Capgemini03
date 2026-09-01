package com.tns.Exception;

public class Throwssdemo {
static void calculate(int a,int b)throws ArithmeticException{
	int result=a/b;
	System.out.println("result :"+result);
}
public static void main(String[] args) {
	try {
		calculate(10,0);
	}
	catch(ArithmeticException a) {
		System.out.println("Cannot divded by zero");
	}
}
}
