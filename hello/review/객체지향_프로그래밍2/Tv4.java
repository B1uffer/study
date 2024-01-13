package 객체지향_프로그래밍2;

public class Tv4 {
	// 인터페이스를 이용한 다중상속
	
	protected boolean power;
	protected int channel;
	protected int volume;
	
	public void power() {
		power = !power;
		
	}
	
	public void channelUp() {
		channel++;
		
	}
	
	public void channelDown() {
		channel--;
		
	}
	
	public void volumeUp() {
		volume++;
		
	}
	
	public void volumeDown() {
		volume--;
		
	}
	
	
}
