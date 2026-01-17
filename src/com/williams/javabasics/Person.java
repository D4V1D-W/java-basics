package com.williams.javabasics;

public class Person {
	
	private String name;
	private int age;
	
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setAge(int age) {
		if (age>=0) {
		  this.age=age;
		}
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
