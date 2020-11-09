package com.pojo;

public class Vowels {
	private int vowels;

	public String countVowels(String string) {
		string = string.toUpperCase();
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				vowels++;
			}

		}
		System.out.println("The Number of Vowels are " + vowels);

		return " ";

	}
}
