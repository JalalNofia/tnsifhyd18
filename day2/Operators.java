package com.day2;
import java.util.Scanner;

public class Operators {
public static void main(String[] args) {
	
	Scanner input=new Scanner(System.in);
	System.out.println("Enter value of a");
	int a=input.nextInt();
	
	System.out.println("Enter value of b");
	int b=input.nextInt();
	
	System.out.println("\n==========Arithmetic Operators==============");
	
	
	System.out.println("a+b="+(a+b));
	System.out.println("a-b="+(a-b));
	System.out.println("a*b="+(a*b));
	System.out.println("a/b="+(a/b));
	System.out.println("a%b="+(a%b));
	System.out.println("++a="+(++a));
	System.out.println("--a="+(--a));
	System.out.println("a++="+(a++));
	System.out.println("a--="+(a--)+"\n");
	
	
	System.out.println("========Ternary Operator========");
	
	System.out.println((a>b)?true:false);
	
	
	System.out.println("\n========Assignment operators========");
	System.out.println("a="+5);
	System.out.println("a+="+(a+=5));
	System.out.println("a-="+(a-=5));
	System.out.println("a*="+(a*=5));
	System.out.println("a/="+(a/=5));
	System.out.println("a%="+(a%=5));
	
	
	
	
	
	
}
}
