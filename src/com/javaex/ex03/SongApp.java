package com.javaex.ex03;

public class SongApp {

	public static void main(String[]args) {
		Song song1 = new Song("아이유", "좋은날", "Real", 2010, "3","이민수");
		song1.showInfo();
		Song song2 = new Song("BIGNABG", "거짓말", "ALWAYS", 2007, "2","G-DRAGON");
		song2.showInfo();
		Song song3 = new Song("버스커버스커", "벚꽃엔딩", "버스커버스커1집", 2012, "4","장범준");
		song3.showInfo();
		/*
		Song song2 = new Song();
		Song song3 = new Song();
		
		song1.setArtist("아이유");
		song1.setTitle("좋은날");
		song1.setAlbum("Real");
		song1.setYear(2010);
		song1.setTrack("3");
		song1.setComposer("이민수");
		
		song2.setArtist("BIGBANG");
		song2.setTitle("거짓말");
		song2.setAlbum("ALWAYS");
		song2.setYear(2007);
		song2.setTrack("2");
		song2.setComposer("G-DRAGON");
		
		song3.setArtist("버스커버스커");
		song3.setTitle("벚꽃엔딩");
		song3.setAlbum("버스커버스커1집");
		song3.setYear(2012);
		song3.setTrack("4");
		song3.setComposer("장범준");
		
		song1.showInfo();
		song2.showInfo();
		song3.showInfo();
		*/
	}	

}
