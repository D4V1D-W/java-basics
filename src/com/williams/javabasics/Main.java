/*
 * Day 8 - Constructors
 *
 * This program demonstrates the use of constructors
 * to initialize objects.
 */

package com.williams.javabasics;

public class Main {

    public static void main(String[] args) {
    	
    	Person person1 = new Person("David",20);
    	Person person2 = new Person ();
    	
    
    	
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