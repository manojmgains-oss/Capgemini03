package com.tns.Polymorphism;

class Studentresults{
	void calculateresult(int math,int java,int sql) {
		int total=math+java+sql;
		System.out.println("total marks:" +total);
	}
	void calculateresult(int math,int python) {
		int total=math+python;
		System.out.println("total marks:" +total);
			}
	void calculateresult(int totalmarks,double bonus) {
		double finalmarks=totalmarks+bonus;
		System.out.println("finalmarks :" +finalmarks);
		
	}
	}

public class MethodOverloading {
	public static void main(String[] args) {
		Studentresults s=new Studentresults();
		s.calculateresult(50,60,90);
		s.calculateresult(40,80);
		s.calculateresult(50,5.0);
	}

}
