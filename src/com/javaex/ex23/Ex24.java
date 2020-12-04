package com.javaex.ex23;

public class Ex24 {

	public static void main(String[]args) {
		
		Ractangle r = new Ractangle(5,5);
		r.showInfo();
		
		try{
			Ractangle r01 = null;
			r01.showInfo();
		}catch(NullPointerException e) {
			System.out.println("널포인트 발생 --> 처리로직");
		}
		
		try {
			int[] intArray = new int[] {3,6,9};
			System.out.println(intArray[3]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위빡 --> 처리로직");
			System.out.println(e.toString());
		}
	}
}
