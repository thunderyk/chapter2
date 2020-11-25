package com.javaex.ex09;

public class TVApp {

	public static void main(String[]args) {
		
		TV tv = new TV(7, 20, false);
		tv.status();
		
		tv.power(true);
		tv.volume(120);
		tv.status();
		//tv 켜고 초기에 채널 7임, 볼륨 120으로 잡아도 max가 100이라서 100됨.
		
		tv.volume(true);
		tv.status();
		//볼륨이 최대가 100이라서 볼륨 올려도 볼륨 100임
		tv.volume(false);
		tv.status();
		//볼륨 100에서 1개 줄임 볼륨 99됨
		tv.volume(0);
		tv.status();
		//볼륨을 0으로함.
		tv.volume(false);
		tv.status();
		//볼륨은 min을 0으로 해야해서 0에서 줄여도 0이됨
		
		tv.channel(0);
		tv.status();
		//채널을 0으로 해도 min 채널은 1이라 1이됨
		tv.channel(false);
		tv.status();
		//채널을 내려도 min 채널은 1이라 1이됨
		tv.channel(true);
		tv.channel(true);
		tv.channel(true);
		tv.status();
		//1채널에서 채널을 올려서 4번 채널이 됨
		tv.channel(256);
		tv.status();
		//채널은 최대 255라서 256을 해도 255가됨
		tv.channel(true);
		tv.channel(true);
		tv.channel(true);
		tv.status();
		//255채널에서 아무리 올려도 255번 채널임
		tv.channel(false);
		tv.status();
		//255에서 채널은 내려서 254됨
		tv.power(false);
		tv.status();
		//tv를 꺼버림
		tv.power(true);
		tv.status();
		//tv를 다시켬
	}
}
