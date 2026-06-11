package com.williams.javabasics;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonService {
	
	private List <Person> people = new ArrayList<>();
	
	// Register a person with centralized validation
	public void register(Person person) {
		people.add(person);
		System.out.println("Registered" +person.getName());
	}
	
	// List all people
	public void listAll() {
		if  (people.isEmpty()) {
			System.out.println("No people registered");
		}
		for (Person p:people) {
			p.showInfo();
			System.out.println("----");
			
		}
	}
	
	// Search by name (returns null if it doesn't exist — Day 24 we improved it with Optional)
    public Optional<Person> findByName(String name) {
        for (Person p : people) {
            if (p.getName().equalsIgnoreCase(name)) {
                return Optional.of(p);
            }
        }
        return Optional.empty();
    }
    
    //count registered people
    public int count() {
        return people.size();
    }
}
