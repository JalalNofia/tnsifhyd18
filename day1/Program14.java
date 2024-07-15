package com.day1;

import java.util.Scanner;

public class Program14 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("enter a number");
	int n=input.nextInt();
	int rev=0;
	while(n!=0) {
		int digit=n%10;
		rev=rev*10+digit;
		n/=10;
}
	System.out.println("reversed number is "+ rev);
}}
