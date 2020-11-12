package com.main;

import java.util.Scanner;

import com.pojo.MyCalculator;

public class MyCalculatorMain {

	public static void main(String[] args) {
		System.out.println("Enter the number to print sum of factors :");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		scanner.nextLine();
		MyCalculator calculator = new MyCalculator();
		System.out.println("Sum of factors of " + number + " :" + calculator.divisor_sum(number));
		scanner.close();
		calculator = null;
	}

}
