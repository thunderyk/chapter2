package com.javaex.ex19;

public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ractangle[] rArray = new Ractangle[3];
		
		rArray[0] = new Ractangle("빨강","노랑",5,10);
		rArray[1] = new Ractangle("빨강","파랑",20,30);
		rArray[2] = new Ractangle("빨강","초록",100,100);
		
		for(int i=0;i<rArray.length;i++) {
			rArray[i].draw();
		}
		
		Circle[] cArray = new Circle[3];
		cArray[0] = new Circle("파랑", "파랑", 5);
		cArray[1] = new Circle("노랑", "노랑", 10);
		cArray[2] = new Circle("초록", "초록", 15);
	}

}
