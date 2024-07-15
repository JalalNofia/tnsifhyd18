package com.day1;

import java.util.Scanner;

public class Program19 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("enter a number");
	int n=input.nextInt();
	
	int[] array=new int[n];
	
	System.out.println("enter the elements of the array");
	for(int i=0;i<n;i++) {
		array[i]=input.nextInt();
	}
	int max=array[0];
	int min=array[0];
	for(int i=1;i<n;i++) {
		
		if(array[i]>max)
		{
			max=array[i];
			}
		if(array[i]<min)
		{
			min=array[i];
			}
		}
	System.out.println("max element of the array is: "+max);
	System.out.println("min element of the array is: "+min);
}
}
