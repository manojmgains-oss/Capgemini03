package com.tns.StreamAPI;

import java.util.Arrays;
import java.util.List;

//map()+tilist()
public class Test2 {
public static void main(String[] args) {
	List<String> names=Arrays.asList("Manu","Shaiob","Raj");
	List<String> uppernames=names.stream().map(name->name.toUpperCase()).toList();
	System.out.println(uppernames);
}
}
