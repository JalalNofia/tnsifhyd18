package com.Day3;

public class ForLoopStatement {
	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};	
		for(int i:a)
		{
		System.out.println(i);	
		}
		
		char ch[]= {'H','e','l','o'};
		for(char c:ch)
		{
			System.out.print(c);		
		}
		System.out.println(" ");
		String s1[]= {"hi","hello","world"};

		for(String s:s1)
		{
			System.out.print(s+" ");		
		}
	}
}

