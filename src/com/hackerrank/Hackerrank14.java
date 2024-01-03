package com.hackerrank;

import java.util.*;


public class Hackerrank14 {

    public static void main(String[] args) {
	   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
    
        int a[] = new int[n];			//First Enter how many no. of array u want to print then Enter array list
        for(int i = 0; i < n; i++){
            a[i]=scan.nextInt();
        }

        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}