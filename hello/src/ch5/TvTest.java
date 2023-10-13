package ch5;

class Tv {
	// 생략된 코드 : 
	
	public Tv () {	// 생성자의 특징 : class와 mathod의 이름이 같다
		
		// 생성자는 new를 할때 쓰임
		
	}
	
	static int hello() {
		
		System.out.println("hello, world!");
		
		return 2344;
		
	}
	
	
	String color;
	boolean power;
	int channel;
	
	void power() { 
		
		power = !power; }
	
	void channelUp() { // 이걸로 tv를 작동시킨다 이게 메서드다
		
		++channel; }
	
	void channelDown() { 
		--channel; 
	}
	
}

public class TvTest	{
	
	public static void main(String grgs[]) {
		
		Tv.hello();
		
		Integer i = new Integer(0);
		int i2 = 0;
									
		Tv t = new Tv();    	// t (      )  
		
		t.channel = 7;
		t.channelDown();
		
		System.out.println("현재 채널은 "  + t.channel + "입니다.");
		
	}
	
}
	
