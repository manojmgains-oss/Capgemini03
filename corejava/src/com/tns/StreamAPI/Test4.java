package com.tns.StreamAPI;

import java.util.Arrays;
import java.util.List;

//distinct method (remove the duplicate values)
public class Test4 {
public static void main(String[] args) {
	List<Integer> a=Arrays.asList(11,2,4,41,5,33,88,90,33,2);
	long count=a.stream().distinct().count();
	System.out.println("Unique values :"+count);
}
}
