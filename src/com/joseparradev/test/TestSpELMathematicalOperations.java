package com.joseparradev.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.joseparradev.model2.Rectangle;
import com.joseparradev.model2.RectangleCalculator;

public class TestSpELMathematicalOperations {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext2.xml");

		Rectangle rectangle = contexto.getBean("rectangle", Rectangle.class);
		System.out.println("--------------------------------Bean Rectangle---------------------------------------");
		System.out.println("Length: " + rectangle.getLength());
		System.out.println("Breadth: " + rectangle.getBreadth());
		System.out.println("--------------------------------Bean RectangleCalculator-----------------------------");
		// Perform Mathematical operations on values
		RectangleCalculator rectangleCalculator = contexto.getBean("rectangleCalculator", RectangleCalculator.class);
		System.out.println("Perimeter: " + rectangleCalculator.getPerimeter());
		System.out.println("Area: " + rectangleCalculator.getArea());
		// Perform Relational and logical comparisons.
		System.out.println("is it a big rectangle?: " + rectangleCalculator.getIsBigRectangle());

		Rectangle rectangle1 = contexto.getBean("rectangle1", Rectangle.class);
		System.out.println("--------------------------------Bean Rectangle One---------------------------------------");
		System.out.println("Length: " + rectangle1.getLength());
		System.out.println("Breadth: " + rectangle1.getBreadth());
		System.out.println("--------------------------------Bean RectangleCalculator One-----------------------------");
		// Perform Mathematical operations on values
		RectangleCalculator rectangleCalculator1 = contexto.getBean("rectangleCalculator1", RectangleCalculator.class);
		System.out.println("Perimeter: " + rectangleCalculator1.getPerimeter());
		System.out.println("Area: " + rectangleCalculator1.getArea());
		// Perform Relational and logical comparisons.
		System.out.println("is it a big rectangle?: " + rectangleCalculator1.getIsBigRectangle());

		contexto.close();

	}

}
