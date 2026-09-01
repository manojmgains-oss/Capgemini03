package com.tns.Exception;

public class Throwsdemo2 {
static void Login(String name, String password)throws Exception{
	if(name.equals("admin")) {
		throw new Exception("invalid username");
	}
	if(!password.equals("1234")){
			throw new Exception("invalid password");
}
	System.out.println("login successful");
}
public static void main(String[] args) {
	try {
		Login("admin","111");
	}
	catch (Exception s) {
		System.out.println(s.getMessage());
	}
	System.out.println("Login Process complete");
}
}
