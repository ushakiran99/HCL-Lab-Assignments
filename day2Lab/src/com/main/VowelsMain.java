package com.main;

import java.util.Scanner;

import com.pojo.Vowels;

public class VowelsMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		String string = scanner.nextLine();
		scanner.close();
		Vowels vowels = new Vowels();
		vowels.countVowels(string);

	}

}
