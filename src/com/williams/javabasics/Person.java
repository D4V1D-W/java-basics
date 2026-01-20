/*
 * Day 9 - Inheritance (Parent Class)
 *
 * This class represents a generic person.
 * It contains common attributes and behaviors
 * that can be inherited by other classes.
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
	System.out.println("name: "+name);
	System.out.println("age: "+age);
	
}


}
