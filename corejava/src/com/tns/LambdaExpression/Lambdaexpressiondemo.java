package com.tns.LambdaExpression;
interface Drawable{
	public void draw();
}
class Test implements Drawable{
	int width=20;
	
	public void draw() {
		System.out.println("drawing :"+width);
	}
}

public class Lambdaexpressiondemo {
	public static void main(String[] args) {
		Drawable d=new Test();
		d.draw();
	}

}
