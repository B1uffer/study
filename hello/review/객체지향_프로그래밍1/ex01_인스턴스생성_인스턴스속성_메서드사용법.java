package 객체지향_프로그래밍1;

public class ex01_인스턴스생성_인스턴스속성_메서드사용법 {

	public static void main(String[] args) {
		
		Tv t;
		t = new Tv();
		
		t.channel = 7;
		t.channeldown();
		t.channelup();
		t.channelup();
		
		System.out.println("현재 채널은 " + t.channel +"번 입니다.");

	}

	
}
