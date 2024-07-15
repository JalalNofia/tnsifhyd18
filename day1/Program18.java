package com.day1;

import java.util.Scanner;

public class Program18 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("enter a number");
	int number=input.nextInt();
	
	System.out.println("enter the range");
	int range=input.nextInt();
	
	System.out.println("multiplication table for "+number + ":");
	for(int i=1;i<=range;i++) {
		System.out.println(number+"*"+i+"="+(number*i));
	}
}
}
