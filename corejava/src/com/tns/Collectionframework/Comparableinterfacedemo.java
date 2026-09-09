package com.tns.Collectionframework;

import java.util.ArrayList;
import java.util.Collections;

class Student  implements Comparable<Student>{
	int marks;
	String Name;
	public Student(int marks, String name) {
		super();
		this.marks = marks;
		Name = name;
	}
	//This id for Integer
	//@Override
//	public int compareTo(Student o) {
//		
//		return this.marks-o.marks;
	//}
	@Override
	public String toString() {
		return "Student [marks=" + marks + ", Name=" + Name + "]";
	}
	//This is for String
	@Override
	public int compareTo(Student o) {
		
		return o.Name.compareTo(this.Name);
	}
}
public class Comparableinterfacedemo {
	public static void main(String[] args) {
		ArrayList<Student> s=new ArrayList<>();
		s.add(new Student(85,"Manu"));
		s.add(new Student(55,"Raju"));
		s.add(new Student(65,"Manju"));
		s.add(new Student(25,"Anu"));
		
		Collections.sort(s);
		System.out.println(s);
	}

}
