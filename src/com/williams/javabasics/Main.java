/*
 * Day 11 - Abstraction and Interfaces
 *
 * Concepts applied:
 * - Abstraction using interfaces
 * - Implementation of interface methods
 * - Polymorphism with interfaces
 * - Decoupling code using contracts
 *
 * This program demonstrates how different classes
 * can implement the same interface and provide
 * different behaviors at runtime.
 */


package com.williams.javabasics;

public class Main {

    public static void main(String[] args) {
    	
  Person p1 = new Person("Carlos",40);
  Person p2 = new Student("David",20," Systems Engineering");
  
  p1.greet();
  System.out.println("----");
  p2.greet();
  
  
  //Day 11 Interfaces
  System.out.println();
  System.out.println("-------------------");
  System.out.println("    Day 11 tests:  ");
  System.out.println("===================");
  System.out.println("      Animals      ");
  System.out.println("===================");
  
  Animal a1 = new Dog(); 
  Animal a2 = new Cat();
  
  a1.MakeSound();
  System.out.println("----");
  a2.MakeSound();

  
    }
}


	

