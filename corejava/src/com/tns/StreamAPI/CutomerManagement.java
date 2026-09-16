package com.tns.StreamAPI;

import java.util.Arrays;
import java.util.List;

class Customer{
	private String name;
	private String city;
	public Customer(String name, String city) {
		super();
		this.name=name;
		this.city=city;
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}


public class CutomerManagement {
	public static void main(String[] args) {
		List<Customer> c=Arrays.asList(new Customer("Manu","Ban"),
				new Customer("Shaiob","Tmk"),
				new Customer("RAJ","Ban"),
				new Customer("Shabu","Tmk"),
				new Customer("delip","Tmk"));
		c.stream().filter(c1->c1.getCity().equals("Ban")).forEach(c1->System.out.println(c1.getName()+" "+ c1.getCity()));
	}

}
