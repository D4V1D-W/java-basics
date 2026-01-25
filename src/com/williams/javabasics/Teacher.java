package com.williams.javabasics;

public class Teacher extends Person implements Greetable {

	public Teacher (String name,int age ) {
		super(name,age);
	}
	
     @Override
     public void greet() {
    		System.out.println("Hello I'm Teacher ");

     }
     
     public void showInfo() {
    		super.showInfo();
     }
}
