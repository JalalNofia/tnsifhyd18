package com.day2;

public class Car2Main {
	public static void main(String[] args) {
		Car2Parameterized c2 = new Car2Parameterized("closed"	, "on", "seated", 10);
		
		System.out.println(c2.run());
	}

}
