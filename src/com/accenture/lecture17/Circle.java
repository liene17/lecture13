package com.accenture.lecture17;

public class Circle {

	double radius = 2.3;
	String color = "red";

	public Circle() {

	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;

	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {

	}

	@Override
	public String toString() {
		return "Circle [Area is = " + getArea() + "]";
	}

	public double getArea() {
		return Math.PI * (radius * radius);

	}
}
