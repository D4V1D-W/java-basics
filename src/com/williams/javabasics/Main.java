/*
 * Day 6 - Classes and Objects (OOP Basics)
 *
 * This program creates a Person object
 * and checks whether the person is an adult.
 */

package com.williams.javabasics;

public class Main {

    public static void main(String[] args) {
    	
    	Person person1 =new Person();
    	
    	person1.name= "David";
    	person1.age= 20;
    	
    	person1.greet();
    	
    	if (person1.isAdult()) {
    		System.out.println("The person is a Adult");
    	}
    	else {
    		System.out.println("The person is a minor");
    	}
    	
    }
}