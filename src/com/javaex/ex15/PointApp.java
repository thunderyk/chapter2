package com.javaex.ex15;

public class PointApp {

	public static void main(String[]args) {
		Point p = new Point(4,4);
		ColorPoint cp1 = new ColorPoint("red");
		cp1.setX(5);
		cp1.setY(5);
		ColorPoint cp2 = new ColorPoint(10,10,"blue");
		
		p.Draw();
		cp1.Draw();
		cp2.Draw();
	}
}
