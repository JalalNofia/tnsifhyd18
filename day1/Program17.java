package com.day1;

import java.util.Scanner;

public class Program17 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("enter a number");
	int number=input.nextInt();
	
	int count=0;
	int temp=number;
	while(temp!=0) {
		temp/=10;
		count++;
		
	}
	System.out.println("number of digits in " +number + " is: "+count);
}
}
