package com.williams.javabasics;

public class InvalidAgeException extends RuntimeException{
	
	
	private static final long serialVersionUID = 2612332605271381821L;

	public InvalidAgeException(String menssage) {
		super(menssage);
	}

}
