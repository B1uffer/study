package 객체지향_프로그래밍2;

public class Card {

	// 나는 트럼프 카드를 만들거야
	
	static final int KIND_MAX = 4;		// 카드 무늬의 수 스페이드, 하트, 클로버, 다이아
	static final int NUM_MAX = 13;		// 무늬별 카드 수 1~10, 에이스, 잭, 퀸, 킹
	
	static final int SPADE = 4;
	static final int DIAMOND = 3;
	static final int HEART = 2;
	static final int CLOVER = 1;
	
	int kind;
	int number;
	
	Card() {
		this(SPADE, 1);
		
	}
	
	Card(int kind, int number) {
		this.kind = kind;
		this.number = number;
		
	}
	
	public String toString() {
		String[] kinds = {" ", "CLOVER", "HEART", "DIAMOND", "SPADE"};
		String numbers = "0123456789XJQK";  // 숫자 10은 로마자 X로 표현
		
		return "kind : " + kinds[this.kind] + ", number : " + numbers.charAt(this.number);
	}
	
	
}
