package com.javaex.ex07;

public class Song {

	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	public Song() {
		
	}
	
	public Song(String title, int track) {
		this.title = title;
		this.track = track;
		
		if(track < 5) {
			this.track = 0;
		}else {
			this.track = track;
		}
		System.out.println("생성자(2)");
	}
	
	public Song(String artist, String title, String album, int year, int track, String composer) {
		this(title, track);
		
		this.artist = artist;
		this.album = album;
		this.year = year;
		this.composer = composer;
		
	}
	
	public Song(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}
	/*
	public Song(String title, String composer) {
		
	}*/
	
	
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	
	public String getTitle() {
		return this.title;
	}
	public String getArtist() {
		return this.artist;
	}
	public String getAlbum() {
		return this.album;
	}
	public String getComposer() {
		return this.composer+" 작곡";
	}
	public int getYear() {
		return this.year;
	}
	public int getTrack() {
		return this.track;
	}
	
	public void showInfo() {
		System.out.println(getArtist()+", "+getTitle()+" ("+getAlbum()+", "+getYear()+", "+getTrack()+"번 트랙"+", "+getComposer()+")");
	}

	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer + ", year="
				+ year + ", track=" + track + "]";
	}
	
	

}
