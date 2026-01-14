/*
 * Day 3 - Control Flow and Input Validation
 *
 * This program asks the user for their age
 * and determines whether they are a minor or an adult.
 * It also validates incorrect inputs.
 */

package com.williams.javabasics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age < 0) {
            System.out.println("Invalid age.");
        } else if (age < 18) {
            System.out.println("You are a minor.");
        } else {
            System.out.println("You are an adult.");
        }

        scanner.close();
    }
}

