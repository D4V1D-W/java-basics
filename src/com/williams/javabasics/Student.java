/*
 * Day 9 - Inheritance (Child Class)
 *
 * This class extends Person and represents a student.
 * It inherits attributes and methods from Person.
 */

package com.williams.javabasics;

public class Student extends Person {
	
	String career;
	
public Student(String name,int age,String career) {
	super(name,age);
	this.career= career;
}
public void study () {
	System.out.println("is studying"+career);
}
}
