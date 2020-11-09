package com.pojo;

public class Smallest {
	private int temp;
	private int result;

	public void printSmall(int num1, int num2, int num3) {
		temp = num1 < num2 ? num1 : num2;
		result = num3 < temp ? num3 : temp;
		System.out.println("The Smallest number is " + result);
	}
}
