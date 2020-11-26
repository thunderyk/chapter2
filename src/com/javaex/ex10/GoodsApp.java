package com.javaex.ex10;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods camera = new Goods();
		camera.setName("니콘");
		camera.setPrice(4000000);
		System.out.println(camera.getTotalCount());
		
		Goods computer = new Goods("LG그램", 1000000);
		
		Goods cup = new Goods("머그컴");
		cup.setPrice(2000);
		
		System.out.println(camera.getTotalCount());
		
		camera.showInfo();
		computer.showInfo();
		cup.showInfo();
	}

}
