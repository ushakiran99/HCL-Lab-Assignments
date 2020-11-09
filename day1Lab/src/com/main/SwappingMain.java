package com.main;

import java.util.Scanner;

import com.pojo.Swapping;

public class SwappingMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number one");
		int number1 = scanner.nextInt();
		System.out.println("Enter Number two");
		int number2 = scanner.nextInt();
		scanner.close();
		Swapping swapping = new Swapping();
		swapping.swap(number1, number2);
		swapping = null;

	}

}
