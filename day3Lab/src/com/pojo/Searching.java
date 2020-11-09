package com.pojo;

public class Searching {
	public static int search(int[] integers, int element) {
		for (int i = 0; i < integers.length; i++) {
			if (integers[i] == element) {
				return i;
			}
		}
		return -1;
	}

}
