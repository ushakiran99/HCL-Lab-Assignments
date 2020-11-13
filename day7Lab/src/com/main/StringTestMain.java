package com.main;

import java.util.Scanner;
import com.pojo.StringTest;

public class StringTestMain {

	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		scanner.close();

		int result = StringTest.checkCharacter(string);
		if (result == 1) {
			System.out.println("Valid");
		} else if (result == -1) {
			System.out.println("Invalid");
		}
	}
}
