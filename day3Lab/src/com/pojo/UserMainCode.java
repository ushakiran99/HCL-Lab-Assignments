package com.pojo;

public class UserMainCode {
	public static String reshape(String string, char character) {
		int length = string.length();
		StringBuffer stringBuffer = new StringBuffer(length);
		stringBuffer.append(string);
		stringBuffer.reverse();
		StringBuffer finalString = new StringBuffer(2 * length - 1);
		finalString.append(stringBuffer.charAt(0));
		for (int i = 1; i < length; i++) {
			finalString.append('-');
			finalString.append(stringBuffer.charAt(i));
		}
		return new String(finalString);
	}
}
