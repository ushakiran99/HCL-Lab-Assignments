package com.main;

import com.pojo.A;

public class OOPExercise {
	public static void main(String[] args) {
		A objA = new A();
		System.out.println("in main(): ");
		System.out.println("objA.a = " + objA.a);// 'a' is a private variable so we cannot access it
		objA.a = 222;// 'a' is private variable we cannot assign a value to it.
						// we can assign value to it by calling the setter function obj.setA()
	}
}
