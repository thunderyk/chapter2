package com.javaex.ex24;

import java.io.IOException;

public class MyFile {

	public String fileRaed(String path){
	
		return "학교종이 땡땡땡 어서 모이자";
	}

	public String fileRaed2(String path){
		
		try {
			throw new IOException();
		}catch(IOException e) {
			System.out.println("파일이 없습니다.");
		}
		
		return "학교종이 땡땡....";
	}
	
	public String fileRaed3(String path) throws IOException{
		
		throw new IOException();
	}
}
