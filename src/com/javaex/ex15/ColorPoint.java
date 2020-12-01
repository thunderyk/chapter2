package com.javaex.ex15;

public class ColorPoint extends Point{

	String color;
	
	public ColorPoint(String color) {
		this.color = color;
	}
	
	public ColorPoint(int x, int y, String color) {
		super.x = x;
		super.y = y;
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "ColorPoint [color=" + color + ", x=" + x + ", y=" + y + "]";
	}
	
	public void Draw() {
		System.out.println("x= "+x+" y= "+y+" color: "+color);
	}
	
}
