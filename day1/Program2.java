package com.day1;

import java.util.Scanner;

public class Program2 {
public static void main(String[]args) {
	Scanner read=new Scanner(System.in);
	System.out.println("Enter a number");
	int n=read.nextInt();
	
	if(n%2==0) {
		System.out.print("Number is even");
	}
	else {
		System.out.print("Number is odd");
	}
	
}
}
