package com.pojo;

public class MiddleChar {

	private int position;
	private int length;

	public void display(String string) {

		if (string.length() % 2 == 0) {
			position = string.length() / 2 - 1;
			length = 2;
		} else {
			position = string.length() / 2;
			length = 1;
		}
		String middleChar = string.substring(position, position + length);
		System.out.println("The Middle Character of the given string is " + middleChar);

	}

}
