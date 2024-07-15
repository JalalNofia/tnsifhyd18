package com.day1;

import java.util.Scanner;

public class Program11 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("enter first number");
	int a=input.nextInt();
	System.out.println("enter second number");
	int b=input.nextInt();
	
	int avg=(a+b)/2;
	
	System.out.println("Average is :"+avg);
}
}
