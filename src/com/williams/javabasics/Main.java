/*
 * Day 12 - Abstract Classes vs Interfaces
 *
 * Concepts applied:
 * - Abstract classes with shared logic
 * - Method overriding
 * - Interfaces as contracts
 * - Combining inheritance and interfaces
 *
 * This program demonstrates the difference between
 * abstract classes and interfaces and when to use each.
 */



package com.williams.javabasics;

public class Main {

    public static void main(String[] args) {
    	

  Person p2 = new Student("David",20," Systems Engineering");
  
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

  
  //Day 12 Abstract classes vs Interfaces
  System.out.println();
  System.out.println("-------------------------------");
  System.out.println("           Day 12 test:        ");
  System.out.println("===============================");
  System.out.println(" Abstract Classes vs Interfaces");
  System.out.println("===============================");
  System.out.println();
  
  Person t = new Teacher("Jose",40);
  Person e = new Student("Williams",22,"Systems Engineering");
  
  t.greet();
  t.showInfo();
  System.out.println();
  e.greet();
  e.showInfo();
  
  
  
    }
}


	

