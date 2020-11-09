package com.main;

import java.util.Scanner;

import com.pojo.Smallest;

public class SmallestMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number One");
		int num1 = scanner.nextInt();
		System.out.println("Enter Number two");
		int num2 = scanner.nextInt();
		System.out.println("Enter Number three");
		int num3 = scanner.nextInt();
		scanner.close();
		Smallest smallest = new Smallest();
		smallest.printSmall(num1, num2, num3);

	}

}
