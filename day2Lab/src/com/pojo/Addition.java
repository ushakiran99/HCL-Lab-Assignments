package com.pojo;

public class Addition {
	public static void Add(int[] numbers) {
		String solution = "" + numbers[0];
		int sum = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			sum += numbers[i];
			solution += "+" + numbers[i];
			System.out.println(solution + "=" + sum);
		}
	}
}
