package com.main;

import java.io.LineNumberReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;

public class ReadingLinesFromFile {
	public static void main(String[] args) {
		String strline = "";

		try {
			LineNumberReader reader = new LineNumberReader(
					new InputStreamReader(new FileInputStream("C:\\demo\\ReadingFiles.txt")));
			while (((strline = reader.readLine()) != null) && reader.getLineNumber() <= 3) {
				System.out.println(strline);
			}
			reader.close();
		} catch (Exception e) {
			System.err.println("File not found");
		}
	}
}
