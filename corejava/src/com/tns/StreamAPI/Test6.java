package com.tns.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Test6 {
public static void main(String[] args) {
	List<String> s=Arrays.asList("Apple","Samsung","Vivo","Oppo");
	Optional<String> r=s.stream().skip(1).findFirst();
	System.out.println(r.orElse("Product not found"));
}
}
