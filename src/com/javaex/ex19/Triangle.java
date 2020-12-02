package com.javaex.ex19;

public class Triangle {

	private String fillColor;
	private String lineColor;
	private int width;
	private int height;
	
	public Triangle() {
		
	}
	
	public Triangle(String fillColor, String lineColor, int width, int height) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
		this.width = width;
		this.height = height;
	}
	
	
	public String getFillColor() {
		return fillColor;
	}
	public String getLineColor() {
		return lineColor;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public void setHeight(int height) {
		this.height = height;
	}

	public void draw() {
		System.out.println("사각형-면색: "+fillColor+" 선색: "+lineColor+" 가로: "+width+" 세로: "+height);
	}
	
	@Override
	public String toString() {
		return "Ractangle [fillColor=" + fillColor + ", lineColor=" + lineColor + ", width=" + width + ", height="
				+ height + "]";
	}

}
