package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point();
		p1.setterX(1);
		p1.setterY(1);
		System.out.println("x= "+p1.getterX()+"   "+"y= "+p1.getterY());
		p1.draw();
		
		Point p2 = new Point();
		p2.setterX(2);
		p2.setterY(2);
		System.out.println("x= "+p2.getterX()+"   "+"y= "+p2.getterY());
		p2.draw();
		
		Point p3 = new Point();
		p3.setterX(3);
		p3.setterY(3);
		System.out.println("x= "+p3.getterX()+"   "+"y= "+p3.getterY());
		p3.draw();
		
		Point p4 = new Point();
		p4.setterX(4);
		p4.setterY(4);
		System.out.println("x= "+p4.getterX()+"   "+"y= "+p4.getterY());
		p4.draw();
		
	}

}
