package com.day2;

import java.util.Scanner;
import java.util.Scanner.*;

public class Program1 {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter your  name");
		String name=input.nextLine();
		
		System.out.println("Enter your age");
		int age=input.nextInt();
		
		System.out.println("Enter your Salary");
		double salary=input.nextDouble();
		
		System.out.println("name of the employee: "+name);
		
		System.out.println("age of the employee: "+age);
		
		System.out.println("Salary of the employee: "+salary);
		
		
	}
	}


