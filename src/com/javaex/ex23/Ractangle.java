package com.javaex.ex23;

public class Ractangle {
	private int width;
	private int height;
	
	public Ractangle() {
		
	}
	
	public Ractangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public void setHeight(int height) {
		this.height = height;
	}

	public void showInfo() {
		System.out.println("가로: "+width+" 세로: "+height+" 사각형을 그렸습니다.");
	}
	
	@Override
	public String toString() {
		return "width=" + width + ", height="+ height + "]";
	}

}
