package com.day4;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of elements");
	int n=sc.nextInt();

	int array[]=new int[10];

	System.out.println("Enter the elements of the array");
	for(int i=0;i<n;i++) {
		
		array[i]=sc.nextInt();
		
	}
	System.out.println("The array elements are");
    for(int i=0;i<n;i++) {
    	
		
		System.out.println(array[i]);
		
	}

	}

}
