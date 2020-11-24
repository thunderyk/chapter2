package com.javaex.ex01;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods camera = new Goods("니콘",400000);
		camera.showInfo();
		

		Goods computer = new Goods("LG그램",1000000);
		computer.showInfo();

		Goods cup = new Goods("머그컵",2000);
		cup.showInfo();
		/*
		camera.name = "니콘";
		camera.price = 400000;
		
		System.out.println(camera.name);
		System.out.println(camera.price);
		
		Goods computer = new Goods();
		computer.name ="LG그램";
		computer.price=1000000;
		
		System.out.println(computer.name);
		System.out.println(computer.price);
		
		Goods cup = new Goods();
		cup.name = "머그컵";
		cup.price = 2000;
		
		System.out.println(cup.name);
		System.out.println(cup.price);
		
		camera.price = 450000;

		System.out.println(camera.name);
		System.out.println(camera.price);
		*/
	}

}
