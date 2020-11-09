package com.main;

import java.util.Scanner;

import com.pojo.UserMainCode;

public class SumOfSquaresMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number");
		int number = scanner.nextInt();
		scanner.close();
		System.out.println(
				"The sum of the squares of the even digits is " + UserMainCode.sumOfSquaresOfEvenDigits(number));

	}

}
