package com.tns.LambdaExpression;

import java.util.Scanner;

interface Cabfare{
	double calculate(double distance);
}
public class TestDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the distance in KM :");
		double distance=sc.nextDouble();
		Cabfare fare=(d)->{
			if(d<=5) {
				return d*15;
			}
			else {
				return(5*15)+((d-5)*12);
			}
		};
		System.out.println("cab fare :"+fare.calculate(distance));
	}

}
