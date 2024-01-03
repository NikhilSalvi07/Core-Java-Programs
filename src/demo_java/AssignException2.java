package demo_java;

import com.exception.checked.AgeException;

public class AssignException2 {
	
	int id;
	String name;
	public AssignException2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AssignException2(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public void ApplyForLicense(int age) throws AssignException {
		//Business Logic
		if(age<16) { 
			//AgeException ae = new AgeException(age);
			//throw ae;
			throw new AssignException(age);		//This line reduce the below 2 lines of code
		}
		else if(age>65) {
			//throw new AssignException(age);
			System.out.println("Your Lisence is Expired and you are Overaged");
		}
		else
			System.out.println("You are Eligible For Lisence");
	}
}
