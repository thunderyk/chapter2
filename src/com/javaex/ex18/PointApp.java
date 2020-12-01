package com.javaex.ex18;

public class PointApp {

	public static void main(String[]args) {
		
		Point[] cpArray = new Point[5];
		
		Point p1 = new Point(1,1);
		Point p2 = new Point(3,3);
		ColorPoint cp1 = new ColorPoint(5,5,"blue");
		ColorPoint cp2 = new ColorPoint(7,7,"Yellow");
		ColorPoint cp3 = new ColorPoint(9,9,"black");
		cpArray[0] = p1;
		cpArray[1] = p2;
		cpArray[2] = cp1;
		cpArray[3] = cp2;
		cpArray[4] = cp3;

		for(int i=0;i<cpArray.length;i++) {
			cpArray[i].draw();
		}
		
	}
}
