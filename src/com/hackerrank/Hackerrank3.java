package com.hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Hackerrank3 {
    //private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();            
        String ans="";
        if(n%2==1||n%2==0&& n>5 && n<21){
          ans = "Weird";
        }
        else{

           if(n%2==0&& n>1 && n<6||n>20){
          ans = "Not Weird";
        }

        }
        System.out.println(ans);

    }   
}