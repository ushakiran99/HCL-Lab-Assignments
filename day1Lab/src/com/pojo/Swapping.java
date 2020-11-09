package com.pojo;

public class Swapping {
	private int temp;

	public void swap(int number1, int number2) {
		temp = number1;
		number1 = number2;
		number2 = temp;
		System.out.println("After Swapping Number 1 is " + number1 + " and Number 2 is " + number2);
	}
}
