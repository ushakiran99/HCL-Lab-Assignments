package com.main;

import java.util.Scanner;

import com.pojo.Average;

public class AverageMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number one");
		int num1 = scanner.nextInt();
		System.out.println("Enter number two");
		int num2 = scanner.nextInt();
		System.out.println("Enter number three");
		int num3 = scanner.nextInt();

		Average average = new Average();
		int result = average.display(num1, num2, num3);
		System.out.println("The average of " + num1 + ", " + num2 + " and " + num3 + " is " + result);
		scanner.close();
		average = null;
	}

}
