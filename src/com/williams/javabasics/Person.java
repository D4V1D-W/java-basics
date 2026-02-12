
package com.williams.javabasics;

public abstract class Person {
	
    protected String name;
    protected int age;

    public Person (String name,int age) {
        PersonValidator.validateAge(age);
	    this.name = name;
	    this.age = age;
    }


    public String getName() {
	    return name;
    }

    public int getAge() {
	    return age;
    }


    public abstract void greet();

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


