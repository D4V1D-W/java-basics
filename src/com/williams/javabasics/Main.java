/*
 * Day 5 - Interactive Menu with Loops and Switch
 *
 * This program displays a menu that allows the user to:
 * 1. Check if they are an adult or a minor
 * 2. Exit the program
 *
 * It uses:
 * - while loop to keep the program running
 * - switch statement to handle menu options
 * - Scanner for user input
 */



package com.williams.javabasics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
    	Scanner scanner  = new Scanner(System.in);
    	
    	int option = 0;
    	
    	while(option != 2) {
    		
    		System.out.println("/n===MENU===");
    		System.out.println("1. check age");
    		System.out.println("2. Exit");
    		System.out.println("choose an option");
    		
    		
    		if (!scanner.hasNextInt()) {
    			System.out.println("Invalid option . Please enter a number. ");
    			scanner.next();
    			continue;
    			}
    	
    	
    	option = scanner.nextInt();
    	
    	switch (option) {
    	
    	case 1: 
    		checkAge (scanner);
    		break;
    		
    	case 2: 
    		System.out.println("Exiting program. Goodbay");
    		break;
    		
    	default:
        		System.out.println("invalid option ,try again");
    		
        	}
    	}
    	 scanner.close();
    	}
    	
    	
    	
    

    
    	
    	private static void checkAge(Scanner scanner) {

        int age = -1;

        // Loop until a valid age is entered
        while (age < 0) {
            System.out.print("Enter your age: ");
            
            

            if (scanner.hasNextInt()) {
                age = scanner.nextInt();

                if (age < 0) {
                    System.out.println("Age cannot be negative. Try again.");
                }
            } 
            
            
            else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // clear invalid input
            }
        }

        if (age >= 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are a minor");
        }
    	}
        
}


