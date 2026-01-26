package com.williams.javabasics;

public class Teacher extends Person implements Greetable {

	private String subject;
	
	public Teacher (String name,int age,String subject ) {
		super(name,age);
		this.subject = subject;
	}
	
    @Override
    public void greet() {
    	System.out.println("Hello I'm Teacher ");

    }
     
    @Override
    public void showInfo() {
    	super.showInfo();
    	System.out.println("Subject: "+subject);
    }
}
