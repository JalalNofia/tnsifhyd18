package com.day2;

public class Overridemain extends Override{
	String display()
	{
		return "Instance content of class Overridemain";
	}
	static void display1()
	{
		System.out.println("Static content of Overridemain");
	}
	
	
	public static void main(String[] args) {
		Override.display1(); //static cannot be override
		
		Override a1=new Overridemain();
		System.out.println(a1.display());
	}
}
