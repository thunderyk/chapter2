package com.javaex.ex24;

import java.io.IOException;

public class MyFileApp {

	public static void main(String[]args) {
		MyFile mf = new MyFile();
		
		String str = mf.fileRaed("c:/javaStudy/test.txt");
		System.out.println(str);
		
		
		MyFile mf2 = new MyFile();
		String str2 = mf2.fileRaed2("c:/javaStudy/test.txt");
		
		MyFile mf3 = new MyFile();
		try {
			String str3 = mf3.fileRaed3("c:/javaStudy/test.txt");
		}catch(IOException e) {
			System.out.println("");
		}
	}
}
