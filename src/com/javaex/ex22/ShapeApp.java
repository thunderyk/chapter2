package com.javaex.ex22;

public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point p = new Point(3,3);
		p.draw();
		System.out.println(p.getX());
		
		Drawable pp = new Point(6,6);
		pp.draw();
		
		((Point)pp).getX();
		
		Drawable[]dArray = new Drawable[4];
		
		Drawable r01 = new Ractangle("빨강","빨강",4,8);
		Drawable c01 = new Circle("주황","주황",5);
		Drawable t01 = new Triangle("노랑","노랑",10,10);
		Drawable p01 = new Point(5,5);
		
		dArray[0] = r01;
		dArray[1] = c01;
		dArray[2] = t01;
		dArray[3] = p01;
		
		for(int i=0;i<dArray.length;i++) {
			dArray[i].draw();
		}
		
		
		System.out.println("==============면적구하기===============");
		for(int i=0;i<dArray.length;i++) {
			if(dArray[i] instanceof Shape) {
				System.out.println(((Shape)dArray[i]).area());
			}
		}
	}

}
