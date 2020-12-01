package com.javaex.ex16;

public class Student extends Person{
private String schoolName;
	
	public Student() {
		
	}
	public Student(String name, int age, String schoolName) {
		/*
		super.setName(name);
		super.setAge(age);
		*/
		super(name,age);
		this.schoolName = schoolName;
	}
	
	public Student(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + "]";
	}
	public void showInfo() {
		System.out.println("이름: "+name+" 나이: "+getAge()+" 학교: "+schoolName);
	}
}
