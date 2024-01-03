package com.exception.checked;

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LicenseApplication li = new LicenseApplication(123, "rushi");
		try {
			li.ApplyForLicense(20);
		} catch (AgeException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();		//It prints all the errors in the program
			System.out.println("Sorry, You are eligible after "+(16 - e.getAge())+" Years");
		}
		
		
	}

}
