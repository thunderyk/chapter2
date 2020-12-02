package com.javaex.ex19;

public class Circle {

	private String fillColor;
	private String lineColor;
	private double radius;
	
	public Circle() {
		
	}
	public Circle(String fillColor, String lineColor, double radius) {
		this.fillColor =fillColor;
		this.lineColor = lineColor;
		this.radius = radius;
	}
	
	public String getFillColor() {
		return fillColor;
	}
	public String getLineColor() {
		return lineColor;
	}
	public double getRadius() {
		return radius;
	}
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	@Override
	public String toString() {
		return "Circle [fillColor=" + fillColor + ", lineColor=" + lineColor + ", radius=" + radius + "]";
	}
	
	
	
}
