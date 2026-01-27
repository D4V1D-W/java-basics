/*
 * Day 14 - Interfaces and Real Polymorphism (Polymorphism with Arrays)
 *
 * In this day, interfaces are used to define common behavior
 * that can be implemented by multiple unrelated classes.
 *
 * The Greetable interface is created and implemented by
 * different classes such as Person, Student and Teacher.
 *
 * This allows true polymorphism by programming to an interface
 * instead of concrete classes, following best practices
 * in object-oriented design.
 */

package com.williams.javabasics;

public class Main {

    public static void main(String[] args) {
    	
      // tests
	  Person p0 = new Student("David",20," Systems Engineering");
	  
	  p0.greet();
	  
	  
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
	  System.out.println("       Day 12 and 13 test:     ");
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
	  
	  
	  
	  
	  System.out.println();
	  System.out.println("--------------------------------");
	  System.out.println("          Day 14  test:         ");
	  System.out.println("================================");
	  System.out.println("Interfaces and Real Polymorphism");
	  System.out.println("================================");
	  System.out.println();
  
	  
	  Person p1 = new Teacher("Laura", 35, "Mathematics");
	  Person p2 = new Student("Carlos", 20, "Systems Engineering");
	  
	  p1.showInfo();
	  System.out.println("----");
	  p2.showInfo();
	  
	  System.out.println();
	  System.out.println("--------------------------------");
	  System.out.println("          test Array            ");
	  System.out.println("================================");
	  System.out.println();
	  //Array
	  
	  Person[]people = {
			  new Student("Ana",25,"Medicine"),
			  new Teacher("Pedro", 40, "Physics")		  
	  };
	  
	  for (Person p:people) {
		  p.showInfo();
		  System.out.println("----");
	  }
	  
    }
}


	

