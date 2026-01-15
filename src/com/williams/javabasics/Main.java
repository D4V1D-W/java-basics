/*
 * Day 4 - Loops and Input Validation
 *
 * This program repeatedly asks the user for their age
 * until a valid non-negative integer is entered.
 *
 * It uses:
 * - while loop for repetition
 * - Scanner.hasNextInt() for input validation
 * - conditional logic to determine if the user is a minor or an adult
 *
 * This ensures the program does not crash on invalid input.
 */


package com.williams.javabasics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int age = -1;

        // Loop until a valid age is entered
        while (age < 0) {
            System.out.print("Enter your age: ");

            if (scanner.hasNextInt()) {
                age = scanner.nextInt();

                if (age < 0) {
                    System.out.println("Age cannot be negative. Try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // clear invalid input
            }
        }

        if (age >= 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are a minor");
        }

        scanner.close();
    }
}


