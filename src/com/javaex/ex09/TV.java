package com.javaex.ex09;

public class TV {

	private int channel= 0;
	private int volume= 0;
	private boolean power = false;
	
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	public void power(boolean power) {
		this.power = power;
	}
	
	public void channel(int channel) {
		if(channel<=0) {
			this.channel = 1;
		}else if(channel>255) {
			this.channel = 255;
		}else {
			this.channel = channel;
		}
	}
	public void channel(boolean up) {
		if(up) {
			this.channel+=1;
		}else {
			this.channel-=1;
		}
		channel(this.channel);
	}
	
	public void volume(int volume) {
		if(volume<0) {
			this.volume = 0;
		}else if(volume>100) {
			this.volume = 100;
		}else {
			this.volume = volume;
		}
	}
	public void volume(boolean up) {
		if(up) {
			this.volume+=1;
		}else {
			this.volume-=1;
		}
		volume(this.volume);
	}
	
	public void status() {
		if(this.power) {
			System.out.println("TV가 켜져있습니다.");
			System.out.println("채널: "+this.channel+" 볼륨: "+this.volume);
		}else {
			System.out.println("TV가 꺼져있습니다.");
		}
		System.out.println();
	}

	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public boolean isOn() {
		return power;
	}	
}
