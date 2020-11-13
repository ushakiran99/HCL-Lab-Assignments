package com.main;

import java.io.FileWriter;
import java.io.PrintWriter;

public class TextAppendMain {
	public static void main(String[] args) {

		String textToAppend = " Append text demo program";
		try {
			FileWriter fileWriter = new FileWriter("C:\\demo\\AppendText.txt", true);
			PrintWriter printWriter = new PrintWriter(fileWriter);
			printWriter.println(textToAppend); // New line
			printWriter.close();
			System.out.println("Success");
		} catch (Exception e) {
			System.err.println("Something went wrong" + e);
		}

	}
}