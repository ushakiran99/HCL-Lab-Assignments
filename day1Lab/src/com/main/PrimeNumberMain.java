package com.main;

import java.util.Scanner;

import com.pojo.PrimeNumber;

public class PrimeNumberMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PrimeNumber primenumber = new PrimeNumber();
		System.out.println("Enter the Number");
		primenumber.setNum(scanner.nextInt());
		scanner.close();
		int flag = 0;

		if (primenumber.getNum() <= 1) {
			System.out.println(primenumber.getNum() + " is not a Prime Number");
		} else {

		}
		for (int i = 2; i <= primenumber.getNum() / 2; i++) {
			if (primenumber.getNum() % i == 0) {
				System.out.println(primenumber.getNum() + " is not a Prime number");
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println(primenumber.getNum() + " is a Prime number");
		}

	}

}
