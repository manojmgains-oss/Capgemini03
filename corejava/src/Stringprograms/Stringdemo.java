package Stringprograms;

public class Stringdemo {
public static void main(String[] args) {
	
	String s="Hello iam Manoj";
	
	System.out.println("lenght :"+s.length());
	
	System.out.println("Charater at the index 6 :"+s.charAt(6));
	
	System.out.println("Upper case :"+s.toUpperCase());
	System.out.println("Lower case :"+s.toLowerCase());
	
	System.out.println(s.contains("Manoj"));
	
	System.out.println(s.startsWith("Hello"));
	
	System.out.println(s.endsWith("Shaiob"));
	
	System.out.println(s.substring(6,10));
	
	System.out.println(s.replace("Manoj", "Raj"));
	
}
}
