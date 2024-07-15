package com.day1;

import java.util.Scanner;

public class Program12 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("enter first string");
	String a=input.nextLine();
	System.out.println("enter second string");
	String b=input.nextLine();
	
	String concatstring=a+b;
	System.out.println("Concatenated String is: "+concatstring);
}
}
