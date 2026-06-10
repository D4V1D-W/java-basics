package com.williams.javabasics;

import java.util.ArrayList;
import java.util.List;

public class BoundedPersonService<T extends Person> {

    private List<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
    }

    // Now we can call methods of Person because T extends Person
    public void listAll() {
        for (T item : items) {
            item.showInfo();   // This was NOT possible in GenericService<T>
            System.out.println("----");
        }
    }

    public int count() {
        return items.size();
    }

    public T findByName(String name) {
        for (T item : items) {
            if (item.getName().equalsIgnoreCase(name)) {
                return item;
            }
        }
        return null;
    }
}


