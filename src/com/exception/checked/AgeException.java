package com.exception.checked;

//Custom Exception Class

public class AgeException extends Exception {
	int age;
	//default constructors

	public AgeException() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AgeException(int age) {
		super();
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
}
