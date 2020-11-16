package com.pojo;

public class OddChar {
	private String string;

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public void odd(String string) {
		String oddString = "";
		for (int i = 0; i < string.length(); i++) {
			if (i % 2 == 0) {
				continue;
			}
			oddString += string.charAt(i);

		}

		System.out.println(" The given String is: " + string);
		System.out.println(" The modified  odd String is " + oddString);

	}

}
