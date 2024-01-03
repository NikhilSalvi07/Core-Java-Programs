package com.collection;

import java.util.ArrayList;
/*
public class DemoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List li = new List();
		ArrayList<Integer> al = new ArrayList();	//generic
		//Perform the basic operations
		//Integer i = new Integer(10);
		al.add(10);//auto boxing
		//al.add("abcd");	//It cannot get String value only add Integer value in array list
		al.add(10);
		//al.add(21.5f);
		al.add(300); 	
	}

}
*/


import java.util.ArrayList;
import java.util.List;

class Emplyoee {
     int id;
     String name;
     int Salary;
     int pf;
     
     //Constructor
     public Emplyoee() {
			
		}
    public Emplyoee(int id, String name, int Salary, int pf) {
        this.id = id;
        this.name = name;
        this.Salary = Salary;
        this.pf = pf;
    }

     int getTotalSalary() {
        return Salary + pf;
    }

    @Override
    public String toString() {
        return "Emplyoee ID: " + id + "\nEmplyoee Name: " + name + "\nSalary : " + Salary + "\npf : " + pf + "\nTotal Salary: " + getTotalSalary();
    }
}

public class DemoList{

    public static void main(String[] args) {
        List<Emplyoee> e = new ArrayList<>();

        // Create student objects and add them to the list
        e.add(new Emplyoee(1, "Rushi", 80000,5000));
        e.add(new Emplyoee(2, "Shubham", 75000, 4000));
        e.add(new Emplyoee(3, "Virat", 90000,7000));

        // Print student details using a for loop
        for (Emplyoee Emplyoee : e) {
            System.out.println(Emplyoee);
            System.out.println("=====================");
        }
    }
}


