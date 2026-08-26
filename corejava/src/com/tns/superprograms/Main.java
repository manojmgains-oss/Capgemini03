package com.tns.superprograms;


class Employee{
	int salary=10000;
}
class Senioremployee extends Employee{
	int salary=20000;
	void displayinfo() {
	 System.out.println("senior emplyoee salary "+salary);
	 System.out.println(" Emplyoee salary "+super.salary);
	}
}
public class Main {
	public static void main(String[] args) {
		Senioremployee s=new Senioremployee();
		s.displayinfo();
	}

}
