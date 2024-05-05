package com.s1.indu;

public class Approach1 {
	String name="Nofia";
	static String place="hyd";
	
	void display() {
		System.out.println("This is instance method");
	}
	
    static String display1() {
    	System.out.println("This is static method");
    	return "String";
	}
	
public static void main(String[]args) {
	
	Approach1 n1=new Approach1();
	System.out.println(n1.name);//accessing the instance variable
	
	n1.display();//accessing instance method
	
	System.out.println(Approach1.place);
	Approach1.display1();//accessing static variable
	//accessing static method

}
	

}
