package Stringprograms;

public class Immutabledemo {
	public static void main(String[] args) {
		String s1="Sachin";
		String s2=s1;
		String s3=s2;
		
		System.out.println("Before Modification");
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);
		System.out.println("s3:"+s3);
		
		s1="Manoj";
		
		System.out.println("After Modification");
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);
		System.out.println("s3:"+s3);
	}

}
