package com.williams.javabasics;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PersonRegistry {

    // Clave: nombre, Valor: Person
    private Map<String, Person> registry = new HashMap<>();

    public void register(Person person) {
        registry.put(person.getName(), person);
        System.out.println("Registered: " + person.getName());
    }

    public Optional<Person> findByName(String name) {
        return Optional.ofNullable(registry.get(name));
    }

    public boolean exists(String name) {
        return registry.containsKey(name);
    }

    public void remove(String name) {
        if (registry.containsKey(name)) {
            registry.remove(name);
            System.out.println("Removed: " + name);
        } else {
            System.out.println("Person not found: " + name);
        }
    }

    public void listAll() {
        if (registry.isEmpty()) {
            System.out.println("No people registered.");
            return;
        }
        for (Map.Entry<String, Person> entry : registry.entrySet()) {
            System.out.println("Key: " + entry.getKey());
            entry.getValue().showInfo();
            System.out.println("----");
        }
    }

    public int count() {
        return registry.size();
    }

    public Collection<Person> getAll() {
        return registry.values();
    }
}