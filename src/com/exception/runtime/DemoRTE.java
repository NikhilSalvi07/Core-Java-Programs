package com.exception.runtime;

public class DemoRTE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Task 1
		try {
		int len = args.length;	//Getting the length of array - args
		int num = 10/len;		//compiler doesn't know that even len can be 0
		System.out.println("num val is "+num);
		}
		/*catch(ArithmeticException rushi) {		//This all exceptions are childs of Exception Class
			System.out.println("Error");
			rushi.printStackTrace();
		}*/
		catch(Exception e) {					//Father of all Exception Library
			e.fillInStackTrace();
		}
		
		//Task 2
		try {
		A a = null;
		a.showData();
		}
		catch(NullPointerException npe) {
			npe.printStackTrace();
		}
		
		//Task 3
		try {
		System.out.println("Command line arguments are "+args[0]+" "+args[1]);
		}
		
		catch(ArrayIndexOutOfBoundsException aie) {
			aie.printStackTrace();
		}
		
		//Task 4
		finally {
				//irrespective of exception, this block is executed
				//Used to close connections - DB socket, N/W, file handles ,re-initialization
		System.out.println("Finally all over and done");
		
		}

	}

}

class A{
	int temp;

	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	void showData() {
		System.out.println("Called Show Data Function");
	}
}