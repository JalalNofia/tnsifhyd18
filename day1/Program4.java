package com.day1;

import java.util.Scanner;

public class Program4 {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("enter a number");
		int n=read.nextInt();
		for(int i=2;i<n;i++) 
		{
		
			if(n%i==0) {
				System.out.println("Given number is not a prime");
				break;
				}
			else {
				System.out.println("Given number is a prime");
				break;
			}
			}
	}
}

