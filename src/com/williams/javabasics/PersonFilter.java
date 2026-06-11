package com.williams.javabasics;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PersonFilter {

    // Filtra usando cualquier Predicate que le pases
    public static List<Person> filter(List<Person> people, Predicate<Person> condition) {
        return people.stream()
                .filter(condition)
                .collect(Collectors.toList());
    }

    // Transforma usando cualquier Function que le pases
    public static <R> List<R> map(List<Person> people, Function<Person, R> transform) {
        return people.stream()
                .map(transform)
                .collect(Collectors.toList());
    }
}
