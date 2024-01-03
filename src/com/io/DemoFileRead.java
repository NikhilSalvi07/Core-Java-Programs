package com.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class DemoFileRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//read data from a text file
		FileReader fr;			//right click--> source--> Organize Imports
		BufferedReader br;
		String data;
		File fe;
		
		//object
		try {
			fr = new FileReader("E:\\core_java\\demo_test.txt");		//read the text file content
			br = new BufferedReader(fr);
			data = br.readLine();
			while(data != null) {
				System.out.println(data);
				data = br.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
//		File file = new File("E:\\core_java\\output1.txt");
//		if (!file.exists()) {
//		    try {
//				file.createNewFile();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		    System.out.println("File Created");
//		}
//		else {
//			System.out.println("File Exist");
//		}
	}

}
