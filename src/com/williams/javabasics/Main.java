/*
 * Day 9 - Inheritance Practice
 *
 * This program demonstrates inheritance in Java
 * by using a Person parent class and a Student child class.
 */

package com.williams.javabasics;

public class Main {

    public static void main(String[] args) {
    	
  Student student = new Student("David",20," Systems Engineering");
  
  student.greet();
  student.study();
  
    }
}