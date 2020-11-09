package com.pojo;

public class UserMainCode {

	public static int sumOfSquaresOfEvenDigits(int number) {
		int sum = 0;
		int remainder;
		while (number > 0) {
			remainder = number % 10;
			if (remainder % 2 == 0) {
				sum += (remainder * remainder);
			}
			number /= 10;
		}
		return sum;
	}

}
