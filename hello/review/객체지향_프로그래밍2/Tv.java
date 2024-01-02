package 객체지향_프로그래밍2;

public class Tv {

	boolean power;		// 전원
	int channel;		// 채널
	
	void power() {
		power = !power;		// 켰다 껐다
	}
	
	void channelUp() {
		++channel;			// 채널 올라감
		
	}
	
	void channelDown() {
		--channel;			// 채널 내려감
		
	}
	
}
