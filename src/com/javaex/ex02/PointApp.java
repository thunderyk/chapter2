package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point(1,1);
		System.out.println("x= "+p1.getterX()+"   "+"y= "+p1.getterY());
		p1.draw();
		
		Point p2 = new Point(2,2);
		System.out.println("x= "+p2.getterX()+"   "+"y= "+p2.getterY());
		p2.draw();
		
		Point p3 = new Point(3,3);
		System.out.println("x= "+p3.getterX()+"   "+"y= "+p3.getterY());
		p3.draw();
		
		Point p4 = new Point(4,4);
		System.out.println("x= "+p4.getterX()+"   "+"y= "+p4.getterY());
		p4.draw();
		
	}

}
