package com.main;

import com.pojo1.A;
import com.pojo1.B;
import com.pojo1.C;

public class OOPExercises3 {

	static int a = 555;

	public static void main(String[] args) {
		A objA = new A();
		B objB1 = new B();
		A objB2 = new B();
		C objC1 = new C();
		B objC2 = new C();
		A objC3 = new C();
		objA.display();// output---->a=100
		objB1.display();// output---->a=123
		objB2.display();// output---->a=123
		objC1.display();// output---->a=543
		objC2.display();// output---->a=543
		objC3.display();// output---->a=543
	}

}
