package com.williams.javabasics;

import java.util.ArrayList;
import java.util.List;

public class GenericService<T> {

	private List<T> items = new ArrayList<>();

	public void add(T item) {
		items.add(item);
		System.out.println("Added: " + item);
	}

	public List<T> getAll() {
		return items;
	}

	public int count() {
		return items.size();
	}

	public void listAll() {
		if (items.isEmpty()) {
			System.out.println("No items registered.");
			return;
		}
		for (T item : items) {
			System.out.println(item);
		}
	}
}