package com.tns.LambdaExpression;

interface hello {
	String say(String Hello);
}

public class Lambdaexp {
	public static void main(String[] args) {
		hello h = (Hello) -> {
			System.out.println("Hello iam Manoj");
			return Hello;
		};

		String result = h.say("Welcom!!");
		System.out.println(result);
	}
}