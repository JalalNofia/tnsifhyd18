package com.day1;

import java.util.Scanner;

public class Program7 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("enter first number");
	int a=input.nextInt();
	System.out.println("enter second number");
	int b=input.nextInt();
	System.out.println("enter third number");
	int c=input.nextInt();
	
	int largest;
	if(a>b&&a>c) {
		System.out.println("largest number is :"+a);
	}
	else if(b>a&&b>c) {
		System.out.println("Largest number is: "+b);
	}
	else {
		System.out.println("Largest number is: "+c);
	}
}
}
