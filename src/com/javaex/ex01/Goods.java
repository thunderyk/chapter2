package com.javaex.ex01;

public class Goods {
	
	private String name;
	private int price;
	
	public Goods(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return this.price;
	}
	public void showInfo() {
		System.out.println("제품: "+name);
		System.out.println("가격: "+price);
	}
}
