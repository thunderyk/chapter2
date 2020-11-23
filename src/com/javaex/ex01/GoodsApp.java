package com.javaex.ex01;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods camera = new Goods();
		
		camera.setName("니콘");
		camera.setPrice(400000);
		System.out.println(camera.getName());		
		System.out.println(camera.getPrice());
		

		Goods computer = new Goods();
		
		computer.setName("LG그램");
		computer.setPrice(1000000);
		System.out.println(computer.getName());		
		System.out.println(computer.getPrice());

		Goods cup = new Goods();
		
		cup.setName("머그컵");
		cup.setPrice(2000);
		System.out.println(cup.getName());		
		System.out.println(cup.getPrice());
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
