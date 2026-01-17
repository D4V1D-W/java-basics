/*
 * Day 7 - Encapsulation (private, getters and setters)
 *
 * This program demonstrates encapsulation
 * by controlling access to class attributes.
 */

package com.williams.javabasics;

public class Main {

    public static void main(String[] args) {
    	
    	Person person1 =new Person();
    	
    	person1.setName("David");
    	person1.setAge(20);
    	
    	person1.greet();
    	
    	System.out.println("Age: "+ person1.getAge());
    	
    	
    	if (person1.isAdult()) {
    		System.out.println("The person is a Adult");
    	}
    	else {
    		System.out.println("The person is a minor");
    	}
    	
    }
}