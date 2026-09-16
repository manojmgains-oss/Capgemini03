package com.tns.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Exp1 {
public static void main(String[] args) {
	List<Integer> n=Arrays.asList(10,5,2,6,10);
	n.stream().filter(num->num%5==0).forEach(System.out::println);
}
}
