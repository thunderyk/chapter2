package com.javaex.ex02;

public class Point {

	private int x;
	private int y;
	
	public void setterX(int x){
		this.x = x;
	}
	public void setterY(int y){
		this.y = y;
	}
	public int getterX() {
		return this.x;
	}
	public int getterY() {
		return this.y;
	}
	public void draw() {
		System.out.println("점[x="+this.x+", y="+this.y+"]을 그렸습니다.");
	}
	
}
