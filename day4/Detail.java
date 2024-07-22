package com.day4;

public class Detail {
	public static void main(String[] args) {
		String x = "Nofia";
		String y = "Jalal";
		String z = x.concat(y);
		
		z = z.replace("Jalal", "Mohammad");
		
		System.out.println(z);
		
		if(z.equals("NofiaMohammad")){
			System.out.println("Text is NofiaMohammad");
		}else{
			System.out.println("Text is not NofiaMohammad");
		}

}}
