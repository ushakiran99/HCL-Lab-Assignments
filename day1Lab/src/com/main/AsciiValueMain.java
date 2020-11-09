package com.main;

import java.util.Scanner;

import com.pojo.AsciiValue;

public class AsciiValueMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Character");
		char character = scanner.next().charAt(0);
		scanner.close();
		AsciiValue asciivalue = new AsciiValue();

		System.out.println("The Ascii Value of " + character + " is " + asciivalue.display(character));
	}
}
