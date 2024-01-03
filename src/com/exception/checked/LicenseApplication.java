package com.exception.checked;

//Custom Exception Class

public class LicenseApplication {
	//properties
	int id;
	String name;
	
	//Default Constructor Overloaded
	public LicenseApplication() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public LicenseApplication(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public void ApplyForLicense(int age) throws AgeException {
		//Business Logic
		if(age<16) { 
			//AgeException ae = new AgeException(age);
			//throw ae;
			throw new AgeException(age);		//This line reduce the below 2 lines of code
		}
		else
			System.out.println("Candidate Eligible For Lisence");
	}
	
}
