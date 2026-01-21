

package com.williams.javabasics;

public class Main {

    public static void main(String[] args) {
    	
  Person p1 = new Person("Carlos",40);
  Person p2 = new Student("David",20," Systems Engineering");
  
  p1.greet();
  System.out.println("----");
  p2.greet();
  
    }
}