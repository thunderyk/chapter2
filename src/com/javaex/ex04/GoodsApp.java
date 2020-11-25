package com.javaex.ex04;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods camera = new Goods();
		camera.setName("니콘");
		camera.setPrice(400000);
		camera.showInfo();
		
		Goods computer = new Goods("LG그램",1000000);
		computer.showInfo();
		
		Goods cup = new Goods("머그컵");
		cup.setPrice(2000);
		cup.showInfo();
		
	}

}
