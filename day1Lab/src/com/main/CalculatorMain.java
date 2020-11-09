package com.main;

import java.util.Scanner;

import com.pojo.Calculator;

public class CalculatorMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calculator calculator = new Calculator();
		System.out.println("Enter Number One");
		calculator.setNum1(scanner.nextInt());
		System.out.println("Enter Number Two");
		calculator.setNum2(scanner.nextInt());
		System.out.println("Enter Operation");
		char operation = scanner.next().charAt(0);
		scanner.close();
		int solution;

		switch (operation) {
		case '+':
			solution = calculator.getNum1() + calculator.getNum2();
			break;
		case '-':
			solution = calculator.getNum1() - calculator.getNum2();
			break;
		case '*':
			solution = calculator.getNum1() * calculator.getNum2();
			break;
		case '/':
			solution = calculator.getNum1() / calculator.getNum2();
			break;
		case '%':
			solution = calculator.getNum1() % calculator.getNum2();
			break;

		default:
			System.out.println("Invalid Operation");
			return;

		}
		System.out.println("The Solution is " + solution);

	}

}
