package com.main;

import java.io.FileReader;
import java.io.FileWriter;

public class FileWriteRead {

	public static void main(String[] args) {

		try {
			FileWriter fw = new FileWriter("C:\\demo\\kiran.txt");
			fw.write("Welcome to the files concept in java");
			fw.close();
			System.out.println("File Successfully Created");
		} catch (Exception e) {
			System.out.println("Error Occured" + e);
		}
		try

		{

			FileReader fr = new FileReader("C:\\demo\\kiran.txt");
			int i;
			while ((i = fr.read()) != -1)
				System.out.print((char) i);
			fr.close();
		} catch (Exception e) {
			System.err.println("File not found");
		}
	}
}
