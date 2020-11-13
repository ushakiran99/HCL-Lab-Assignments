package com.main;

import java.util.Calendar;

public class MaxValueOfCalendar {
	public static void main(String[] args) {
		// Create a default calendar
		Calendar calendar = Calendar.getInstance();
		System.out.println();
		System.out.println("\nCurrent Date and Time:" + calendar.getTime());
		int actualMaxYear = calendar.getActualMaximum(Calendar.YEAR);
		int actualMaxMonth = calendar.getActualMaximum(Calendar.MONTH);
		int actualMaxWeek = calendar.getActualMaximum(Calendar.WEEK_OF_YEAR);
		int actualMaxDate = calendar.getActualMaximum(Calendar.DATE);

		System.out.println("Actual Maximum Year: " + actualMaxYear);
		System.out.println("Actual Maximum Month: " + actualMaxMonth);
		System.out.println("Actual Maximum Week of Year: " + actualMaxWeek);
		System.out.println("Actual Maximum Date: " + actualMaxDate + "\n");
		System.out.println();

	}
}
