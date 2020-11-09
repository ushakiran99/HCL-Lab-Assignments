package com.main;

import java.util.Scanner;

import com.pojo.UserMainCode;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		String string = scanner.nextLine();
		System.out.println("Enter the character ");
		char character = scanner.next().charAt(0);
		System.out.println("The final String is :" + UserMainCode.reshape(string, character));
		scanner.close();

	}

}
