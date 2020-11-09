package com.pojo;

public class FizzBuzz {
	private int n = 100;

	public void fizzBuzz() {
		for (int i = 0; i < n; i++) {
			if (i % 5 == 0) {
				System.out.println(" Buzz ");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else {
				System.out.println(i + " ");
			}
		}
	}
}
