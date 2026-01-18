package com.williams.javabasics;

public class Person {
	
	private String name;
	private int age;
	
    // Constructor with parameters
	
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	// Default constructor
	
    public Person () {
		
	} 

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public boolean isAdult() {
		return age >=18;
	}
	
	public void greet() {
		System.out.println("Hello my name is "+name);
	}
}
