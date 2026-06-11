

package com.williams.javabasics;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {

		day11testAnimals();
		day13testAbstractClasses();
		day14testPolymorphism();
		day18CustomExceptions();
		day22ServiceLayer();
		day23Generics();
		day25Streams();
		day26Lambdas();
		day27HashMap();
		day28BuilderPattern();
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
		
		private static void day26Lambdas() {
		    System.out.println("=== Day 26: Lambdas and Functional Interfaces ===");

		    List<Person> people = new ArrayList<>();
		    people.add(new Student("Williams", 22, Career.MATHEMATICS));
		    people.add(new Teacher("Ana", 35, Subject.PHYSICS));
		    people.add(new Student("Carlos", 20, Career.SYSTEMS_ENGINEERING));
		    people.add(new Teacher("Luis", 45, Subject.MATH));

		    // Predicate — filtrar estudiantes
		    System.out.println("-- Students only --");
		    List<Person> students = PersonFilter.filter(people, p -> p instanceof Student);
		    students.forEach(p -> p.showInfo());

		    // Predicate — filtrar mayores de 30
		    System.out.println("\n-- Over 30 --");
		    List<Person> over30 = PersonFilter.filter(people, p -> p.getAge() > 30);
		    over30.forEach(p -> System.out.println(p.getName() + " - " + p.getAge()));

		    // Function — extraer nombres
		    System.out.println("\n-- All names --");
		    List<String> names = PersonFilter.map(people, p -> p.getName());
		    names.forEach(System.out::println);

		    // Combinando Predicates
		    System.out.println("\n-- Students over 21 --");
		    Predicate<Person> isStudent = p -> p instanceof Student;
		    Predicate<Person> isOver21 = p -> p.getAge() > 21;
		    List<Person> result = PersonFilter.filter(people, isStudent.and(isOver21));
		    result.forEach(p -> p.showInfo());
		}
		
		private static void day27HashMap() {
		    System.out.println("=== Day 27: HashMap and Collections ===");

		    PersonRegistry registry = new PersonRegistry();

		    registry.register(new Student("Williams", 22, Career.MATHEMATICS));
		    registry.register(new Teacher("Ana", 35, Subject.PHYSICS));
		    registry.register(new Student("Carlos", 20, Career.SYSTEMS_ENGINEERING));

		    System.out.println("\n-- All people --");
		    registry.listAll();

		    System.out.println("Total: " + registry.count());

		    System.out.println("\n-- Search --");
		    registry.findByName("Ana").ifPresentOrElse(
		            p -> p.greet(),
		            () -> System.out.println("Not found.")
		    );

		    System.out.println("\n-- Exists check --");
		    System.out.println("Williams exists: " + registry.exists("Williams"));
		    System.out.println("Pedro exists: " + registry.exists("Pedro"));

		    System.out.println("\n-- Remove --");
		    registry.remove("Carlos");
		    registry.remove("Pedro");

		    System.out.println("\n-- After remove --");
		    registry.getAll().forEach(p -> System.out.println(p.getName()));
		}
		
		private static void day28BuilderPattern() {
		    System.out.println("=== Day 28: Builder Pattern ===");

		    // Sin Builder — no sabes qué es cada parámetro
		    // new PersonResponse("Williams", 22, "Student", "Mathematics") — confuso

		    // Con Builder — cada campo es explícito
		    PersonResponse response1 = new PersonResponse.Builder()
		            .name("Williams")
		            .age(22)
		            .type("Student")
		            .detail(Career.MATHEMATICS.toString())
		            .build();

		    PersonResponse response2 = new PersonResponse.Builder()
		            .name("Ana")
		            .age(35)
		            .type("Teacher")
		            .detail(Subject.PHYSICS.toString())
		            .build();

		    // Puedes omitir campos opcionales sin romper nada
		    PersonResponse response3 = new PersonResponse.Builder()
		            .name("Carlos")
		            .age(20)
		            .build();

		    System.out.println(response1);
		    System.out.println(response2);
		    System.out.println(response3);
		}
	}







