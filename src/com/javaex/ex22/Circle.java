package com.javaex.ex22;

public class Circle extends Shape implements Drawable{

	private double radius;

	public Circle() {

	}

	public Circle(String fillColor, String lineColor, double radius) {
		super(fillColor, lineColor);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [fillColor=" + super.getFillColor() + ", lineColor=" + super.getLineColor() + ", radius="
				+ radius + "]";
	}

	public void draw() {
		System.out.println("원-면색: " + super.getFillColor() + " 선색: " + super.getLineColor() + " 반지름: " + radius);
	}

	@Override
	public double area() {
		return radius * radius * 3.14;
	}

}
