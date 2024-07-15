package com.day1;

import java.util.Scanner;

public class Program6 {
public static void main(String[] args) {
	String str;
	Scanner input=new Scanner(System.in);
	System.out.println("enter a string");
	str=input.nextLine();
	String reversedStr="";
	
	for(int i=str.length()-1;i>=0;i--) {
		reversedStr+=str.charAt(i);
	}
	System.out.println("reversed string: "+reversedStr);
	
}}
