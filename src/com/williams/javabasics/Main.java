

package com.williams.javabasics;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {

	public static void main(String[] args) {

		day11testAnimals();
		day13testAbstractClasses();
		day14testPolymorphism();
		day18CustomExceptions();
		day22ServiceLayer();
		day23Generics();
		day25Streams();
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
		Person t = new Teacher("Jose", 40, Subject.PHYSICS);
		Person s = new Student("Williams", 22,Career.MATHEMATICS);
		t.greet();
		System.out.println("----");
		s.greet();
	}

	private static void day14testPolymorphism() {
		System.out.println("=== Day 14 ===");
		List<Person> people = new ArrayList<>();
		people.add(new Teacher("Ana", 30, Subject.HISTORY));
		people.add(new Student("Carlos", 20, Career.SYSTEMS_ENGINEERING));
		for (Person p : people) {
			p.showInfo();
			System.out.println("----");
		}
	}



	private static void day18CustomExceptions () {

		try {
			List<Person> people1 = new ArrayList<>();

			people1.add(new Student("Dave", -20, Career.SYSTEMS_ENGINEERING));
			people1.add(new Teacher("Ana", 30,Subject.MATH));

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


	private static void day22ServiceLayer() {
		System.out.println("=== Day 22: Service Layer ===");

		PersonService service = new PersonService();

		service.register(new Student("Williams", 22,Career.MATHEMATICS ));
		service.register(new Teacher("Ana", 35, Subject.PHYSICS));
		service.register(new Student("Carlos", 20, Career.SYSTEMS_ENGINEERING));

		System.out.println("\n-- All people --");
		service.listAll();

		System.out.println("Total registered: " + service.count());

		System.out.println("\n-- Search --");
		Optional<Person> found = service.findByName("Ana");
		found.ifPresentOrElse(
				p -> p.greet(),
				() -> System.out.println("Person not found.")
				);
	}

		private static void day23Generics() {
			System.out.println("=== Day 23: Generics ===");

			System.out.println("-- Generic with Strings --");
			GenericService<String> stringService = new GenericService<>();
			stringService.add("Java");
			stringService.add("Spring Boot");
			stringService.add("Generics");
			stringService.listAll();
			System.out.println("Count: " + stringService.count());

			System.out.println("\n-- Bounded Generic with Person --");
			BoundedPersonService<Person> personService = new BoundedPersonService<>();
			personService.add(new Student("Williams", 22, Career.MATHEMATICS));
			personService.add(new Teacher("Ana", 35, Subject.PHYSICS));
			personService.listAll();

			Optional<Person> found = personService.findByName("Ana");
			found.ifPresentOrElse(
					p -> p.greet(),
					() -> System.out.println("Not found.")
					);

		}
		
		private static void day25Streams() {
		    System.out.println("=== Day 25: Stream API ===");

		    PersonService service = new PersonService();
		    service.register(new Student("Williams", 22, Career.MATHEMATICS));
		    service.register(new Teacher("Ana", 35, Subject.PHYSICS));
		    service.register(new Student("Carlos", 20, Career.SYSTEMS_ENGINEERING));
		    service.register(new Teacher("Luis", 45, Subject.MATH));

		    System.out.println("\n-- All names --");
		    service.getAllNames().forEach(System.out::println);

		    System.out.println("\n-- Only students --");
		    service.getStudents().forEach(p -> p.showInfo());

		    System.out.println("\n-- Exists check --");
		    System.out.println("Ana exists: " + service.exists("Ana"));
		    System.out.println("Pedro exists: " + service.exists("Pedro"));

		    System.out.println("\n-- Find by name --");
		    service.findByName("Carlos").ifPresentOrElse(
		            p -> p.greet(),
		            () -> System.out.println("Not found.")
		    );
		}
		
		
		
	}







