package com.main;

import java.util.Scanner;

import com.pojo.OddChar;

public class OddCharMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string");
		String string = scanner.nextLine();
		scanner.close();
		OddChar oddchar = new OddChar();
		oddchar.odd(string);
		oddchar = null;
	}

}
