package com.javaex.ex20;

public class Ractangle extends Shape{

	private int width;
	private int height;
	
	public Ractangle() {
		
	}
	
	public Ractangle(String fillColor, String lineColor, int width, int height) {
		super(fillColor, lineColor);
		this.width = width;
		this.height = height;
	}
	
	
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public void setHeight(int height) {
		this.height = height;
	}

	public void draw() {
		System.out.println("사각형-면색: "+super.getFillColor()+" 선색: "+super.getLineColor()+" 가로: "+width+" 세로: "+height);
	}
	
	@Override
	public String toString() {
		return "width=" + width + ", height="+ height + "]";
	}

	@Override
	public double area() {
		
		return width * height;
	}
	
	
	
}
