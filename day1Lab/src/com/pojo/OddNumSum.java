package com.pojo;

public class OddNumSum {

	public static int checkSum(int number) {
		int sum = 0;
		int remainder = 0;
		while (number > 0) {
			remainder = number % 10;
			if (remainder % 2 == 1) {
				sum += remainder;
			}
			number /= 10;
		}
		if (sum % 2 == 1) {
			return 1;

		} else {
			return -1;
		}
	}
}
