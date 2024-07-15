package com.day1;

import java.util.Scanner;

public class Program20 {
public static void main(String[] args) {
	int[] array= {2,4,6,8,10};
	int sum=0;
	for(int num:array) {
		sum+=num;
	}
	System.out.println("sum of elements in array: "+sum);
}
}
