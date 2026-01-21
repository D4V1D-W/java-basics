/*
 * Day 10 - Polymorphism and Method Overriding
 *
 * Concepts applied:
 * - Inheritance (Student extends Person)
 * - Encapsulation (private attributes + getters)
 * - Polymorphism (Person reference pointing to Student object)
 * - Method overriding using @Override
 *
 * This program demonstrates how Java decides which method
 * implementation to execute at runtime based on the actual object,
 * not the reference type.
 */


package com.williams.javabasics;

public class Person {
	
private String name;
private int age;

public Person (String name,int age) {
	this.name = name;
	this.age = age;
}


public String getName() {
	return name;
}

public int getAge() {
	return age;
}


void greet() {
	System.out.println("Hi I'm a Person");
	System.out.println("name: "+name);
	System.out.println("age: "+age);
	
}


}
