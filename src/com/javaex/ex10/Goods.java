package com.javaex.ex10;

public class Goods {

	private String name;
	private int price;
	
	public static int totalCount;
	
	public Goods() {
		totalCount =totalCount+1;
	}
	
	public Goods(String name) {
		this.name = name;
		totalCount =totalCount+1;
	}
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
		totalCount =totalCount+1;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
	public int getTotalCount() {
		return totalCount;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void showInfo() {
		System.out.println("상품명:"+name+", 가격:"+price);
	}

	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}
}
