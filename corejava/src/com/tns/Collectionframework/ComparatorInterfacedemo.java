package com.tns.Collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person{
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	void display() {
		
		System.out.println("Name: " +name + "age :" +age);
	}
}
class NameComparator implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		return o1.name.compareTo(o2.name);
	}
	
}

class Agecomparator implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		
		return Integer.compare(o1.age, o2.age);
	}
	
}

public class ComparatorInterfacedemo {
	public static void main(String[] args) {
		List<Person> p=new ArrayList<>();
		p.add(new Person("Manoj",30));
		p.add(new Person("Raj",66));
		p.add(new Person("Anu",40));
		p.add(new Person("Shaiob",80));
		
		Collections.sort(p,new NameComparator());
		System.out.println("Sorted by Name");
		for(Person s:p) {
			s.display();
		}
		Collections.sort(p,new Agecomparator());
		System.out.println("Sorted by Age");
		for(Person s:p) {
			s.display();
		}
		
	}

}
