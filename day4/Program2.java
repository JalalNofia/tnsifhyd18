package com.day4;


import java.util.Scanner;

public class Program2 {
public static void main(String[] args) {
	

	 int[][] arr = new int[3][3];  
	    Scanner sc = new Scanner(System.in); 
	    System.out.println("Enter Element"); 
	    for (int i =0;i<3;i++)  
	    {  
	        for(int j=0;j<3;j++)  
	        {  
	             
	            arr[i][j]=sc.nextInt();  
	            
	        }  
	    }  
	    System.out.println("Printing Elements...");  
	    for(int i=0;i<3;i++)  
	    {   
	        System.out.println();  
	        for(int j=0;j<3;j++)  
	        {  
	            System.out.print(arr[i][j]+"\t");  
	        } }
}}
	    