package com.tns.StreamAPI;

import java.util.Arrays;
import java.util.List;

//filter method (selects the elements that satisfy the condition)
public class Test1 {
public static void main(String[] args) {
	List<Integer> no=Arrays.asList(10,15,44,20,30);
    no.stream().filter(n->n%2==0).forEach(System.out::println);
}
}
