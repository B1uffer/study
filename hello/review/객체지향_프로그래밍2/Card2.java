package 객체지향_프로그래밍2;

public class Card2 {

	final int NUMBER;		// final이기 때문에 상수이지만 선언과 함께 초기화되지 않는다
	final String KIND;		// 생성자에서 단 한번만 초기화 할 수 있음.
	static int width = 100;
	static int height = 250;
	
	Card2(int num, String kind) {		// 생성자의 매개변수 num, kind
		NUMBER = num;	// 매개변수로 넘겨받은 값으로 KIND와 NUMBER을 초기화 함
		KIND = kind;
		
	}
	
	Card2() {
		this(1, "HEART");
		
	}
	
	public String toString() {		// public을 안붙이면 오버라이딩 어쩌고 오류가 나옴
		return KIND + " " + NUMBER;
		
	}
}
