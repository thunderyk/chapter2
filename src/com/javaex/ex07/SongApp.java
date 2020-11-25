package com.javaex.ex07;

public class SongApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song song1 = new Song("아이유", "좋은날", "Real", 2010, 3,"이민수");
		song1.showInfo();
		System.out.println(song1.toString());
		
		Song song2 = new Song();
		song2.setArtist("BIGBANG");
		song2.setTitle("거짓말");
		song2.setAlbum("ALWAYS");
		song2.setYear(2007);
		song2.setTrack(2);
		song2.setComposer("G-DRAGON");
		song2.showInfo();
		
		Song song3 = new Song("벚꽃엔딩", "버스커버스커");
		song3.setAlbum("버스커버스커1집");
		song3.setYear(2012);
		song3.setTrack(4);
		song3.setComposer("장범준");
		song3.showInfo();
	}

}
