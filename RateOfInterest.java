package com.java.practice;

import java.util.Scanner;

public class RateOfInterest {
public static void main(String[] args) {
	
	Scanner input= new Scanner(System.in);
	System.out.println("Enter the principalAmount : ");
	Double principle=input.nextDouble();
	
	System.out.println("Enter the rate : ");
	Double rate=input.nextDouble();
	
	System.out.println("Enter the time : ");
	int time=input.nextInt();
	Double simpleInterest=(principle*rate*time)/100;
	System.out.println("The simple interest is"+simpleInterest);
}
}
