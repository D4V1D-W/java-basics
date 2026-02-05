/*Day 19 - Refactored Main and improved code organization*/

package com.williams.javabasics;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    	
    	        day11testAnimals();
    	        day13testAbstractClasses();
    	        day14testPolymorphism();
    	        day18CustomExceptions();
    	    }



			private static void day11testAnimals() {
    	        System.out.println("=== Day 11: Animals ===");
    	        Animal a1 = new Dog();
    	        Animal a2 = new Cat();
    	        a1.MakeSound();
    	        System.out.println("----");
    	        a2.MakeSound();
    	    }

    	    private static void day13testAbstractClasses() {
    	        System.out.println("=== Day 12-13 ===");
    	        Person t = new Teacher("Jose", 40, "Math");
    	        Person s = new Student("Williams", 22, "Systems");
    	        t.greet();
    	        System.out.println("----");
    	        s.greet();
    	    }

    	    private static void day14testPolymorphism() {
    	        System.out.println("=== Day 14 ===");
    	        List<Person> people = new ArrayList<>();
    	        people.add(new Teacher("Ana", 30, "Math"));
    	        people.add(new Student("Carlos", 20, "Systems"));
    	        for (Person p : people) {
    	            p.showInfo();
    	            System.out.println("----");
    	        }
    	    }


    	    
	        private static void day18CustomExceptions () {

	            try {
	                List<Person> people1 = new ArrayList<>();

	                people1.add(new Student("Dave", -20, "Systems Engineering"));
	                people1.add(new Teacher("Ana", 30, "Mathematics"));

	                for (Person p : people1) {
	                    p.greet();
	                    p.showInfo();
	                    System.out.println("-----");
	                }

	            } catch (InvalidAgeException e) {
	                System.out.println("Error: " + e.getMessage());
	            }

	            System.out.println("Program finished");
	        }
}


	

