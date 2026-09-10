package com.tns.LambdaExpression;

import java.util.Scanner;

interface LoginValidation{
	boolean validateuser(String user,String pass);
	
}
public class LoginMethod {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter username :");
	String username=sc.nextLine();
	
	System.out.println("enter the password :");
	String password=sc.nextLine();
	
	//lambda exprssion
	
	LoginValidation login=(user,pass)->{
		if(user.equals("admin")&&pass.equals("Admin123")) {
			return true;
		}
		return false;
	};
	boolean result=login.validateuser(username, password);
	if(result)
		System.out.println("Login successful");
	else
		System.out.println("invalid user");
}
}
