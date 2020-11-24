package com.javaex.ex03;

public class Song {

	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private String track;
	
	public Song(String artist, String title, String album, int year, String track, String composer) {
		this.artist = artist;
		this.title = title;
		this.album = album;
		this.year = year;
		this.track = track;
		this.composer = composer;
	}
	
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
	public void setTrack(String track) {
		this.track = track+"번 track";
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
	public String getTrack() {
		return this.track;
	}
	
	public void showInfo() {
		System.out.println(getArtist()+", "+getTitle()+" ("+getAlbum()+", "+getYear()+", "+getTrack()+", "+getComposer()+")");
	}

}
