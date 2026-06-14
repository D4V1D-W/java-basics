package com.williams.javabasics;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        // OOP Fundamentals
        day11testAnimals();
        day13testAbstractClasses();
        day14testPolymorphism();

        // Exception Handling
        day18CustomExceptions();

        // Architecture and Design
        day22ServiceLayer();
        day23Generics();
        day24Optional();
        day25Streams();
        day26Lambdas();
        day27HashMap();
        day28BuilderPattern();
        day29MiniProject();
    }

    // ==================== OOP ====================

    private static void day11testAnimals() {
        System.out.println("=== Day 11: Animals ===");
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        a1.MakeSound();
        System.out.println("----");
        a2.MakeSound();
    }

    private static void day13testAbstractClasses() {
        System.out.println("=== Day 12-13: Abstract Classes ===");
        Person t = new Teacher("Jose", 40, Subject.PHYSICS);
        Person s = new Student("Williams", 22, Career.MATHEMATICS);
        t.greet();
        System.out.println("----");
        s.greet();
    }

    private static void day14testPolymorphism() {
        System.out.println("=== Day 14: Polymorphism ===");
        List<Person> people = new ArrayList<>();
        people.add(new Teacher("Ana", 30, Subject.HISTORY));
        people.add(new Student("Carlos", 20, Career.SYSTEMS_ENGINEERING));
        for (Person p : people) {
            p.showInfo();
            System.out.println("----");
        }
    }

    // ==================== EXCEPTIONS ====================

    private static void day18CustomExceptions() {
        System.out.println("=== Day 18: Custom Exceptions ===");
        try {
            List<Person> people = new ArrayList<>();
            people.add(new Student("Dave", -20, Career.SYSTEMS_ENGINEERING));
            people.add(new Teacher("Ana", 30, Subject.MATH));
            for (Person p : people) {
                p.greet();
                p.showInfo();
                System.out.println("-----");
            }
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Program finished");
    }

    // ==================== ARCHITECTURE ====================

    private static void day22ServiceLayer() {
        System.out.println("=== Day 22: Service Layer ===");
        PersonService service = new PersonService();
        service.register(new Student("Williams", 22, Career.MATHEMATICS));
        service.register(new Teacher("Ana", 35, Subject.PHYSICS));
        service.register(new Student("Carlos", 20, Career.SYSTEMS_ENGINEERING));
        System.out.println("\n-- All people --");
        service.listAll();
        System.out.println("Total registered: " + service.count());
        System.out.println("\n-- Search --");
        service.findByName("Ana").ifPresentOrElse(
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
        personService.findByName("Ana").ifPresentOrElse(
                p -> p.greet(),
                () -> System.out.println("Not found.")
        );
    }

    private static void day24Optional() {
        System.out.println("=== Day 24: Optional ===");
        PersonService service = new PersonService();
        service.register(new Student("Williams", 22, Career.MATHEMATICS));
        service.register(new Teacher("Ana", 35, Subject.PHYSICS));
        service.findByName("Ana").ifPresentOrElse(
                p -> p.showInfo(),
                () -> System.out.println("Not found.")
        );
        service.findByName("Pedro").ifPresentOrElse(
                p -> p.showInfo(),
                () -> System.out.println("Pedro not found.")
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
    }

    private static void day26Lambdas() {
        System.out.println("=== Day 26: Lambdas and Functional Interfaces ===");
        List<Person> people = new ArrayList<>();
        people.add(new Student("Williams", 22, Career.MATHEMATICS));
        people.add(new Teacher("Ana", 35, Subject.PHYSICS));
        people.add(new Student("Carlos", 20, Career.SYSTEMS_ENGINEERING));
        people.add(new Teacher("Luis", 45, Subject.MATH));
        System.out.println("-- Students only --");
        PersonFilter.filter(people, p -> p instanceof Student)
                .forEach(p -> p.showInfo());
        System.out.println("\n-- Over 30 --");
        PersonFilter.filter(people, p -> p.getAge() > 30)
                .forEach(p -> System.out.println(p.getName() + " - " + p.getAge()));
        System.out.println("\n-- All names --");
        PersonFilter.map(people, p -> p.getName())
                .forEach(System.out::println);
        System.out.println("\n-- Students over 21 --");
        Predicate<Person> isStudent = p -> p instanceof Student;
        Predicate<Person> isOver21 = p -> p.getAge() > 21;
        PersonFilter.filter(people, isStudent.and(isOver21))
                .forEach(p -> p.showInfo());
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
        System.out.println("\n-- Remove --");
        registry.remove("Carlos");
        System.out.println("\n-- After remove --");
        registry.getAll().forEach(p -> System.out.println(p.getName()));
    }

    private static void day28BuilderPattern() {
        System.out.println("=== Day 28: Builder Pattern ===");
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
        PersonResponse response3 = new PersonResponse.Builder()
                .name("Carlos")
                .age(20)
                .build();
        System.out.println(response1);
        System.out.println(response2);
        System.out.println(response3);
    }

    private static void day29MiniProject() {
        System.out.println("=== Day 29: Mini Project ===");
        SchoolService school = new SchoolService();
        school.register(new Student("Williams", 22, Career.MATHEMATICS));
        school.register(new Teacher("Ana", 35, Subject.PHYSICS));
        school.register(new Student("Carlos", 20, Career.SYSTEMS_ENGINEERING));
        school.register(new Teacher("Luis", 45, Subject.MATH));
        school.register(new Student("Maria", 23, Career.MATHEMATICS));
        school.printReport();
        System.out.println("\n-- Search --");
        school.findByName("Ana").ifPresentOrElse(
                p -> System.out.println(school.buildResponse(p)),
                () -> System.out.println("Not found.")
        );
        System.out.println("\n-- Students over 21 --");
        Predicate<Person> isStudent = p -> p instanceof Student;
        Predicate<Person> isOver21 = p -> p.getAge() > 21;
        school.filter(isStudent.and(isOver21))
                .forEach(p -> System.out.println(school.buildResponse(p)));
    }
}





