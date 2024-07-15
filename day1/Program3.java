package com.day1;

import java.util.Scanner;

public class Program3 {
public static void main(String[] args) {
	int  fact=1;
	Scanner read=new Scanner(System.in);
	System.out.println("Enter a number");
	int n=read.nextInt();
	for(int i=1;i<=n;i++)
	{
	
		 fact=fact*i;
	}
	System.out.println("The factorial of given number is"+fact);
}
}
