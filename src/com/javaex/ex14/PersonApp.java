package com.javaex.ex14;

public class PersonApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p01 = new Person("정우성",45);
		System.out.println(p01.toString());
		
		Student p02 = new Student("서울고등학교");
		System.out.println(p02.toString());
		
		Person p03 = new Person("박명수",50);
		System.out.println(p03.toString());
		
		Student p04 = new Student("박명수",50,"경기고등학교");
		p04.showInfo();
		
	}

}
