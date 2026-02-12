package com.williams.javabasics;

public class PersonValidator {

	 public static void validateAge(int age) {
	    	
	    	if (age < 0) {
	            throw new InvalidAgeException("Age cannot be negative");
	        }
 }
}