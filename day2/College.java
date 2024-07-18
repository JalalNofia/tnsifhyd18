package com.day2;

public class College {

	private String gates;
	private String teacher;
	
	public College() {
		gates="close";
		teacher="present";
	}
	
	public String run() {
		if(gates=="open"&&teacher=="present") {
			return "college is open";
		}
		else {
			return "college is not open";
		}
	}
	
}
