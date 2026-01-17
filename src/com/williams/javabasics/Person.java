package com.williams.javabasics;

public class Person {
	
	String name;
	int age;
	
	boolean isAdult() {
		return age >=18;
	}
	
	void greet() {
		System.out.println("Hello my name is"+name);
	}
}
