package com.williams.javabasics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SchoolService {

    private Map<String, Person> registry = new HashMap<>();

    // Registrar persona
    public void register(Person person) {
        registry.put(person.getName(), person);
        System.out.println("Registered: " + person.getName());
    }

    // Buscar por nombre — Optional
    public Optional<Person> findByName(String name) {
        return Optional.ofNullable(registry.get(name));
    }

    // Filtrar con Predicate — Lambdas
    public List<Person> filter(Predicate<Person> condition) {
        return registry.values().stream()
                .filter(condition)
                .collect(Collectors.toList());
    }

    // Obtener nombres — Stream + map
    public List<String> getAllNames() {
        return registry.values().stream()
                .map(p -> p.getName())
                .collect(Collectors.toList());
    }

    // Construir respuesta — Builder
    public PersonResponse buildResponse(Person person) {
        String type = person instanceof Student ? "Student" : "Teacher";
        String detail = person instanceof Student
                ? ((Student) person).getCareer().toString()
                : ((Teacher) person).getSubject().toString();

        return new PersonResponse.Builder()
                .name(person.getName())
                .age(person.getAge())
                .type(type)
                .detail(detail)
                .build();
    }

    // Generar reporte completo
    public void printReport() {
        System.out.println("===== SCHOOL REPORT =====");
        System.out.println("Total registered: " + registry.size());

        List<Person> students = filter(p -> p instanceof Student);
        List<Person> teachers = filter(p -> p instanceof Teacher);

        System.out.println("Students: " + students.size());
        System.out.println("Teachers: " + teachers.size());

        System.out.println("\n-- All names --");
        getAllNames().forEach(System.out::println);

        System.out.println("\n-- Student details --");
        students.forEach(p -> System.out.println(buildResponse(p)));

        System.out.println("\n-- Teacher details --");
        teachers.forEach(p -> System.out.println(buildResponse(p)));

        System.out.println("=========================");
    }
}