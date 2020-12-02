package com.javaex.ex20;

public abstract class Shape {

	private String fillColor;
	private String lineColor;
	
	public Shape() {
		
	}
	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}
	public String getFillColor() {
		return fillColor;
	}
	public String getLineColor() {
		return lineColor;
	}
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	@Override
	public String toString() {
		return "Shape [fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}
	public abstract void draw();
	
	public abstract double area();
	
	
}
