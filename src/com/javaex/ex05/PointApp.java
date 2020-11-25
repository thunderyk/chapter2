package com.javaex.ex05;

public class PointApp {
	
	public static void main(String[]args) {
		Point p1 = new Point();
		p1.setX(1);
		p1.setY(2);
		p1.draw();
		
		Point p2 = new Point(3,4);
		p2.draw();
		
		Point p3 = new Point(5);
		p3.setY(6);
		p3.draw();
		
		System.out.println(p1.toString());
	}
}
