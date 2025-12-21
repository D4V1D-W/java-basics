/*
 * Day 2 - Java Basics
 *
 * This program reads the user's age from the console using Scanner
 * and determines whether the user is an adult or a minor.
 *
 * Concepts applied:
 * - User input with Scanner
 * - Conditional statements (if / else)
 * - Console output
 */



package com.williams.javabasics;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		 
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter you age :");
		int age =scanner.nextInt();
		
		
		
		if (age>=18 ){
		System.out.println("You are an adult");	
		}
		
		else{
	    System.out.println("You are a minor");
	    
	    scanner.close();
	    
		}
	
	}


}
