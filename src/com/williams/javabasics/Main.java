/*
 * Day 13 - Abstract Classes and Advanced Inheritance
 *
 * In this day, abstract classes are introduced to define common behavior
 * that must be implemented by subclasses.
 *
 * The Person class is converted into an abstract class,
 * forcing child classes like Student and Teacher to implement
 * specific behaviors using abstract methods.
 *
 * This improves design by ensuring a common contract
 * and promotes cleaner and more scalable object-oriented architecture.
 */

package com.williams.javabasics;

public class Main {

    public static void main(String[] args) {
    	
  // tests
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

  
  //Day 12 and 13 Abstract classes vs Interfaces
  System.out.println();
  System.out.println("-------------------------------");
  System.out.println("       Day 12 and 13 test:      ");
  System.out.println("===============================");
  System.out.println(" Abstract Classes vs Interfaces");
  System.out.println("===============================");
  System.out.println();
  
  Person t = new Teacher("Jose",40,"Math");
  Person e = new Student("Williams",22,"Systems Engineering");
  
  t.greet();
  t.showInfo();
  System.out.println("----");
  e.greet();
  e.showInfo();
  
    }
}


	

