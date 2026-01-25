


package com.williams.javabasics;

public abstract class Person {
	
protected String name;
protected int age;

public Person (String name,int age) {
	this.name = name;
	this.age = age;
}


public String getName() {
	return name;
}

public int getAge() {
	return age;
}


void greet() {
	System.out.println("Hi I'm a Person");
	System.out.println("name: "+name);
	System.out.println("age: "+age);
	
}

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


