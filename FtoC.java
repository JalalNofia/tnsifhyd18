package com.java.practice;
import java.util.Scanner;

public class FtoC {
 public static double display() {
	
	 Scanner input=new Scanner(System.in);
	 System.out.println("enter the temperature in (F): ");
	 double f=input.nextDouble();
	 double c=((f-32)/9)*5;
	 System.out.println("The fahrenheit converted to celsius is:"+c);
	 return c;
 }
}
