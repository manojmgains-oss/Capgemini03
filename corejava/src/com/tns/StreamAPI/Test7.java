package com.tns.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Test7 {
public static void main(String[] args) {
	List<Integer> n=Arrays.asList(11000,22222,32222,40000,10003,55000,67777,90009,99000);
	boolean r=n.stream().filter(salary->salary>10000).anyMatch(salary->salary>10000);
	System.out.println("salary found :"+r+n);
	
}
}
