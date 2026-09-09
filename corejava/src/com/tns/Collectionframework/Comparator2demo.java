package com.tns.Collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Book{
	String Catagory;
	int price;
	public Book(String catagory, int price) {
		super();
		Catagory = catagory;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [Catagory=" + Catagory + ", price=" + price + "]";
	}
	
}
class BookComparator implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		
		int result = o1.Catagory.compareTo(o2.Catagory);
		if(result==0) {
			result=o1.price-o2.price;
		}
		return result;
	}
	
}
public class Comparator2demo {
	public static void main(String[] args) {
		List<Book>p=new ArrayList<>();
		p.add(new Book("Java",200));
		p.add(new Book("Python",300));
		p.add(new Book("Java",350));
		p.add(new Book("Python",400));
		
		Collections.sort(p, new BookComparator());
		System.out.println(p);
	}

}
