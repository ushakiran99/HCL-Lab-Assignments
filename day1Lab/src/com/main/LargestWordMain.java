package com.main;

import java.util.Scanner;

import com.pojo.LargestWord;

public class LargestWordMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Sentence");
		String sentence = scanner.nextLine();
		scanner.close();
		System.out.println("The Longest word in the given sentence is " + LargestWord.getLargestWord(sentence));

	}

}
