package com.main;

import java.util.Scanner;

import com.pojo.Addition;

public class AdditionMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = scanner.nextInt();
		scanner.nextLine();

		if (size > 0) {
			System.out.println("Enter the elements");
			int[] array = new int[size];
			for (int i = 0; i < size; i++) {
				array[i] = scanner.nextInt();
				scanner.nextLine();
			}
			Addition.Add(array);

		} else {
			System.out.println(" The array size should be >0");
		}
		scanner.close();
	}

}
