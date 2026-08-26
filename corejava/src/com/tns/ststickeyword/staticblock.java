package com.tns.ststickeyword;

public class staticblock {
	static int employeecount;
	
	static {
		employeecount=90;
		System.out.println("employee System initialized");
	}
public static void main(String[] args) {
	System.out.println("starting employee System...");
	System.out.println("toatal employee :" +employeecount);
}
}
