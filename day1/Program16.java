package com.day1;

import java.util.Scanner;

public class Program16 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("enter a number");
	int number=input.nextInt();
	
	int originum,rem,res=0,n=0;
	originum=number;
	
	while(originum!=0) {
		originum/=10;
		++n;
		
	}
	originum=number;
	
	while(originum!=0) {
		rem=originum%10;
		res+=Math.pow(rem, n);
		originum/=10;
	}
	if(res==number) {
		System.out.println(number+" is an armstrong number");
	
	}
	else {
		System.out.println(number+" is not an armstrong number");
	}
}
}
