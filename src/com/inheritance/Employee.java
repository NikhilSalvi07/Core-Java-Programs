package com.inheritance;

public abstract class Employee {

	int empId;
	String empName;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	
	//concrete method
	void showData() {
		System.out.println("Emp Data is "+empId+" "+empName);
	}
	
	abstract int calcSal();
}

class RegularEmployee extends Employee{

	int bsal;
	//@Override						----->Annotation
	int calcSal() {
		// TODO Auto-generated method stub
		int pf = 200;
		
		return 0;
	}
	
}
