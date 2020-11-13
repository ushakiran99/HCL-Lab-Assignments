package com.main;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class LongestWordMain {
	public static void main(String[] args) throws FileNotFoundException {
		new LongestWordMain().longestWord();
	}

	public String longestWord() throws FileNotFoundException {

		String longestWord = "";
		String temp;
		Scanner sc = new Scanner(new File("C:\\demo\\ReadingFiles.txt"));

		while (sc.hasNext()) {
			temp = sc.next();
			if (temp.length() > longestWord.length()) {
				longestWord = temp;
			}

		}
		System.out.println("\n" + "The longest word is : " + longestWord + "\n");
		return longestWord;
	}
}