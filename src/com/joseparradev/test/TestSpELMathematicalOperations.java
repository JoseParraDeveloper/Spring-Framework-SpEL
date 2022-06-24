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

		contexto.close();

	}

}
