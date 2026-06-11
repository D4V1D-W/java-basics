package com.williams.javabasics;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PersonService {

    private List<Person> people = new ArrayList<>();

    public void register(Person person) {
        people.add(person);
        System.out.println("Registered: " + person.getName());
    }

    public void listAll() {
        if (people.isEmpty()) {
            System.out.println("No people registered.");
            return;
        }
        for (Person p : people) {
            p.showInfo();
            System.out.println("----");
        }
    }

    public Optional<Person> findByName(String name) {
        return people.stream()
                .filter(p -> p.getName().equalsIgnoreCase(name))
                .findFirst();
    }

    // Retorna solo los Students
    public List<Person> getStudents() {
        return people.stream()
                .filter(p -> p instanceof Student)
                .collect(Collectors.toList());
    }

    // Retorna solo los nombres
    public List<String> getAllNames() {
        return people.stream()
                .map(p -> p.getName())
                .collect(Collectors.toList());
    }

    // Verifica si existe alguien con ese nombre
    public boolean exists(String name) {
        return people.stream()
                .anyMatch(p -> p.getName().equalsIgnoreCase(name));
    }

    public int count() {
        return people.size();
    }
}
