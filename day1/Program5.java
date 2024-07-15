package com.day1;

import java.util.Scanner;

public class Program5 {
public static void main(String[] args) {
	Scanner read=new Scanner(System.in);
	System.out.println("enter a number");
	int N=read.nextInt();
	int num1=0,num2=1;
	for(int i=1;i<=N;i++) {
		System.out.println(num1+" ");
		
		int num3=num1+num2;
		num1=num2;
		num2=num3;
	}
}
}
