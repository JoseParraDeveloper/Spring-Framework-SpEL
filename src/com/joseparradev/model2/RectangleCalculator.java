package com.joseparradev.model2;

public class RectangleCalculator {

	private double perimeter;
	private double area;
	private boolean isBigRectangle;

	public RectangleCalculator() {
		super();
	}

	public RectangleCalculator(double perimeter, double area, boolean isBigRectangle) {
		super();
		this.perimeter = perimeter;
		this.area = area;
		this.isBigRectangle = isBigRectangle;
	}

	public boolean getIsBigRectangle() {
		return isBigRectangle;
	}

	public void setIsBigRectangle(boolean isBigRectangle) {
		this.isBigRectangle = isBigRectangle;
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
