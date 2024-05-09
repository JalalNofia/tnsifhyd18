package com.java.practice;

import java.util.Scanner;

public class CircArea {

public double display() {
	
	Scanner input=new Scanner(System.in);
	System.out.print("enter the radius value: ");
	double radius=input.nextDouble();
	double area=3.14*radius*radius;
	 System.out.print("the area of circle is: \n"+area);
	 return area;
	 
 }
}
