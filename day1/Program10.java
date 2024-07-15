package com.day1;

import java.util.Scanner;

public class Program10 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("enter a number");
	int n=input.nextInt();
	int sum=0;
	while(n!=0) {
		sum+=n%10;
		n/=10;
	}
	System.out.println("sum of digits : "+sum);
}
}
