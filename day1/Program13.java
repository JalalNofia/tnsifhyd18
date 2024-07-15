package com.day1;

import java.util.Scanner;

public class Program13 {
public static void main(String[] args) {
	Scanner read=new Scanner(System.in);
	System.out.println("enter a year");
	int n=read.nextInt();

	boolean isLeapYear=(n%4==0 && n%100!=0) || (n%400==0);
	if(isLeapYear) {
		System.out.println(n+" is a leap year");
	}
	else{
		System.out.println(n+" is not a leap year");
}
}
}
