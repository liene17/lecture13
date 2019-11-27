package com.accenture.lecture17;

public class Cylinder extends Circle {

	protected double height = 1.7;

	public Cylinder() {

	}

	public Cylinder(double height) {
		this.height = height;
	}

	public Cylinder(double height, double radius) {
		this.height = height;
		this.radius = radius;
	}

	public Cylinder(double height, double radius, String color) {

	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {

	}

	@Override
	public String toString() {
		return "Cylinder [Height is = " + height + ", radius=" + radius
				+ ", getVolume()=" + getVolume() + "]";
	}

	public double getVolume() {
		return Math.PI * radius * radius * height;

	}

}
