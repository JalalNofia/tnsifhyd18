package com.day1;

import java.util.Scanner;

public class Program15 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
    System.out.println("enter the length of natural numbers");
    int n=input.nextInt();
    int sum=0;
    for(int i=1;i<=n;i++) {
    	sum=sum+i;
    }
    System.out.println("The sum of natural numbers is: "+sum);
    	
}
}
