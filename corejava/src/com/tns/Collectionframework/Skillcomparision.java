package com.tns.Collectionframework;

import java.util.HashSet;

public class Skillcomparision {
public static void main(String[] args) {
	HashSet<String> Javateam=new HashSet<>();
	
	Javateam.add("Java");
	Javateam.add("Python");
	Javateam.add("C++");
	Javateam.add("Sql");
	Javateam.add("WebTec");
	Javateam.add(null);
	System.out.println(Javateam);
	
	HashSet<String> Pythonteam=new HashSet<>();
	
	Pythonteam.add("Sql");
	Pythonteam.add("C++");
	Pythonteam.add("AWs");
	System.out.println(Pythonteam);
	
	HashSet<String> common=(HashSet<String>) Javateam.clone();
	
	common.retainAll(Pythonteam);
	System.out.println("Common Skills :" +common);
	
	HashSet<String> onlyjava=(HashSet<String>) Javateam.clone();
	System.out.println(onlyjava);
}
}
