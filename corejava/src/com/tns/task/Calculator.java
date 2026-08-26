package com.tns.task;


class Calculator1{
	  double calculateArea(double radius) {
		  return Math.PI*radius*radius;
	  }
	  double calculateArea(double length,double breath) {
		  return length*breath;
	  }
	   int calculateArea(int side) {
		   return side*side;
	   }
	   }
public class Calculator{
	public static void main(String[] args) {
		Calculator1 c=new Calculator1();
		System.out.println("Area of Circle :" +c.calculateArea(5.0));
		System.out.println("Area of Rectangle :" +c.calculateArea(10.0,5.0));
		System.out.println("Area of square :" +c.calculateArea(4));
	}

}
