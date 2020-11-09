package com.pojo;

public class LargestWord {

	public static String getLargestWord(String sentence) {
		String[] strings = sentence.split(" ");
		int max = 0;
		String resultantString = "";
		for (String str : strings) {
			int length = str.length();
			if (max < length) {
				max = length;
				resultantString = str;

			}
		}
		return resultantString;
	}

}
