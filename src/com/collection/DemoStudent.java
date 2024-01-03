package com.collection;


import java.util.ArrayList;
import java.util.List;

class Student {
     int id;
     String name;
     int Mks_cc;
     int Mks_dc;
     
     //Constructor
     public Student() {
			
		}
    public Student(int id, String name, int Mks_cc, int Mks_dc) {
        this.id = id;
        this.name = name;
        this.Mks_cc = Mks_cc;
        this.Mks_dc = Mks_dc;
    }

     int getTotalMarks() {
        return Mks_cc + Mks_dc;
    }

    @Override
    public String toString() {
        return "Student ID : " + id + "\nStudent Name : " + name + "\nMks_cc : " + Mks_cc + "\nMks_dc : " + Mks_dc + "\nTotal Marks : " + getTotalMarks();
    }
}

public class DemoStudent {

    public static void main(String[] args) {
        List<Student> s = new ArrayList<>();

        // Create student objects and add them to the list
        s.add(new Student(1, "Nikhil", 80, 90));
        s.add(new Student(2, "Rushi", 75, 85));
        s.add(new Student(3, "Sushant", 90, 80));

        // Print student details using a for loop
        for (Student student : s) {
            System.out.println(student);
            System.out.println("=====================");
        }
    }
}