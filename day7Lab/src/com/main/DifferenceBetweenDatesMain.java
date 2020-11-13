package com.main;

import java.text.ParseException;
import java.util.Scanner;
import com.pojo.DifferenceBetweenDates;

public class DifferenceBetweenDatesMain {

	public static void main(String[] args) throws ParseException {

		System.out.println("Enter the first date in the format  (yyyy-mm-dd)");
		Scanner scanner = new Scanner(System.in);
		String string1 = scanner.nextLine();
		System.out.println("Enter the second date in the format  (yyyy-mm-dd)");
		String string2 = scanner.nextLine();

		System.out.println("Difference between dates is " + DifferenceBetweenDates.dateDifference(string1, string2));
		scanner.close();
	}

}
