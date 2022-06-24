package com.joseparradev.model2;

public class RectangleCalculator {

	private double perimeter;
	private double area;

	public RectangleCalculator() {
		super();
	}

	public RectangleCalculator(double perimeter, double area) {
		super();
		this.perimeter = perimeter;
		this.area = area;
	}

	public double getPerimeter() {
		return perimeter;
	}

	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

}
