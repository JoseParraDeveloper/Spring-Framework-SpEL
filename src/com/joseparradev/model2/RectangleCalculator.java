package com.joseparradev.model2;

public class RectangleCalculator {

	private double perimeter;
	private double area;
	private Boolean isBigRectangle;
	private String message;

	public RectangleCalculator() {
		super();
	}

	public RectangleCalculator(double perimeter, double area, boolean isBigRectangle, String message) {
		super();
		this.perimeter = perimeter;
		this.area = area;
		this.isBigRectangle = isBigRectangle;
		this.message = message;
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

	public Boolean getIsBigRectangle() {
		return isBigRectangle;
	}

	public void setIsBigRectangle(Boolean isBigRectangle) {
		this.isBigRectangle = isBigRectangle;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
