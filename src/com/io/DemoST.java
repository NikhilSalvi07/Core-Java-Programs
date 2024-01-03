package com.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class DemoST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//read the text file
		FileReader fr;
		String data;
		BufferedReader br;
		//Split the given data
		StringTokenizer st;
		
		try {
			fr = new FileReader("Student.txt");
			br = new BufferedReader(fr);
			data = br.readLine();
			while(data!=null) {
				//Split the given string object
				st = new StringTokenizer(data,"#");
				//Iterate until the end of the string object and split 
				while(st.hasMoreElements()) {
					String id = st.nextToken();
					String name = st.nextToken();
					String mks = st.nextToken();
					//Display Data
					System.out.println("ID: "+id+"\tName: "+name+"\tMarks: "+mks);
					//System.out.println("\tName: "+name);
				}
				//read the next record in the text file
				data = br.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
