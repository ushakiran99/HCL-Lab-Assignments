package com.main;

import java.util.Scanner;

import com.pojo.OddNumSum;

public class OddNumSumMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scanner.nextInt();
		scanner.close();
		if (OddNumSum.checkSum(number) == 1) {
			System.out.println("Sum of odd digits is odd");
		} else {
			System.out.println("Sum of odd digits is even");
		}

	}

}
