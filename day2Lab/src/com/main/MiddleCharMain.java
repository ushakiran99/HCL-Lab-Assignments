package com.main;

import java.util.Scanner;

import com.pojo.MiddleChar;

public class MiddleCharMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		String string = scanner.nextLine();
		scanner.close();
		MiddleChar middlechar = new MiddleChar();
		middlechar.display(string);

	}

}
