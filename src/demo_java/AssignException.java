package demo_java;

public class AssignException extends Exception{
	
	int age;

	public AssignException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AssignException(int age) {
		super();
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
}
