package com.javaex.ex20;

public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape[] sArray = new Shape[2];
		
		Shape r01 = new Ractangle("노랑","노랑",100,100);
		Shape c01 = new Circle("초록","초록",50);
		
		sArray[0] = r01;
		sArray[1] = c01;
		
		for(int i=0;i<sArray.length;i++) {
			sArray[i].draw();
		}
	}

}
