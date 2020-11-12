package com.main;

import java.util.Scanner;

import com.pojo.Circle;
import com.pojo.Rectangle;
import com.pojo.Square;

public class Main {
	public static void main(String[] args) {
		System.out.println("Circle\nSquare\nRectangle\nEnter the type of shape :");
		Scanner scanner = new Scanner(System.in);
		String shapeType = scanner.nextLine();
		int radius;
		switch (shapeType) {
		case "Circle":
			System.out.println("Enter the radius :");
			radius = scanner.nextInt();
			scanner.nextLine();
			Circle circle = new Circle(shapeType, radius);
			System.out.println("Area of Circle is " + circle.calculateArea());
			break;
		case "Square":
			System.out.println("Enter the radius :");
			radius = scanner.nextInt();
			scanner.nextLine();
			Square square = new Square(shapeType, radius);
			System.out.println("Area of Square is " + square.calculateArea());
			break;
		case "Rectangle":
			System.out.println("Enter the length :");
			int length = scanner.nextInt();
			scanner.nextLine();
			int breadth = scanner.nextInt();
			scanner.nextLine();
			Rectangle rectangle = new Rectangle(shapeType, length, breadth);
			System.out.println("Area of Rectangle is " + rectangle.calculateArea());
			break;
		default:
			System.out.println("Please enter correct option");
		}
		scanner.close();
		System.gc();
	}

}
