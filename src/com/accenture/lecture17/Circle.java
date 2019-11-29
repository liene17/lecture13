package com.accenture.lecture17;

public class Circle {

	double radius;
	String color;

	public Circle() {
		this.radius = 2.3;
		this.color = "red";

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
		return color = color;
	}

	public void setColor(String color) {

	}

	@Override
	public String toString() {
		return "Circle area is = " + getArea() + "";
	}

	public double getArea() {
		return Math.PI * (radius * radius);

	}
}
