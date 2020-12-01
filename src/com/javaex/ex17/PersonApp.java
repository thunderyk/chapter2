package com.javaex.ex17;

public class PersonApp {

	public static void main(String[]args) {
		Person[] psArray = new Person[5];
		
		Person p01 = new Person("둘리",1200);
		Person p02 = new Person("도우너",300);
		Person p03 = new Person("마이콜",500);
		
		Person s01 = new Student("유재석",44,"서울고등학교");
		Person s02 = new Student("강호동",47,"경기고등학교");
		
		psArray[0] = p01;
		psArray[1] = p02;
		psArray[2] = p03;
		psArray[3] = s01;
		psArray[4] = s02;
		
		for(int i=0;i<psArray.length;i++) {
			psArray[i].showInfo();
		}
		
		System.out.println("=================================================");
		
		System.out.println(((Student)psArray[3]).getSchoolName());
		((Student)psArray[3]).setSchoolName("마산고등학교");
		
		for(int i=0;i<psArray.length;i++) {
			psArray[i].showInfo();
		}
		
		Person t01 = psArray[4];
		//Student t02 = psArray[4]; // 오류 양쪽의 자료형이 다름(Student가 자식이라 암됨)
		//하려면
		Student t02 = (Student)psArray[4];
		Person t04 = (Student)psArray[4]; // 자동으로 업케스팅 된다.
	}
}
