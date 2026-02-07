

package com.williams.javabasics;

public class Student extends Person {
	
	private Career career;
	
    public Student(String name,int age,Career career) {
	    super(name,age);
	    this.career= career;
    }
    public void study () {
	    System.out.println("is studying"+career);
    }

    @Override	
    public void greet() {
	    System.out.println("Hi, I'm Studen ");
    }

    @Override
    public void showInfo() {
	    super.showInfo();
	    System.out.println("Career: "+career);
    }
    
    

}
