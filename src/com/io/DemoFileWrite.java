package com.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoFileWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//accept data from user
		
		BufferedReader br;
		InputStreamReader isr;
		
		//write entered data in to a text file
		FileWriter fw;
		
		//create a new text file
		try {
			fw = new FileWriter("Student.txt",true);//true- whatever data we have entered last time will be  
													//loss when we not give here boolean value as true
													//By default it can overwrite all the data
													//means delete previous data and add new one
			//Read the data from console
			br = new BufferedReader(new InputStreamReader(System.in));	//Now br Object is ready to 
			//Display message to end user
			System.out.println("Enter Student ID");
			String id = br.readLine();
			
			System.out.println("Enter Name");
			String name = br.readLine();
			
			System.out.println("Enter Maths Marks");
			String mks_mm = br.readLine();
			
			//Write Data in to Text file
			fw.write(id);
			fw.write("#");//DELIMITER
			fw.write(name);
			fw.write("#");
			fw.write(mks_mm);
			fw.write("#");
			fw.write("\n");//New Line
			fw.close();//DATA GETS UPDATED
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
