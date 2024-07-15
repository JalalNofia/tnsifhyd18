package com.day1;

import java.util.Scanner;

public class Program9 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("enter first number");
	int a=input.nextInt();
	System.out.println("enter second number");
	int b=input.nextInt();
	
	a=a+b;
	b=a-b;
	a=a-b;
	
	System.out.println("****_____after swapping_____****");
	System.out.println("first number "+a);
	System.out.println("second number "+b);
}
}
