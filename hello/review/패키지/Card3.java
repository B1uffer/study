package 패키지;

final class Card3 {
	
	String kind;		// 종류
	int num;			// 숫자
	
	Card3(String kind, int num) {
		
		this.kind = kind;
		this.num = num;
		
	}
	
	Card3() {
		
		this("DIAMOND", 3);
		
	}
	
	public String toString() {
		
		return "KIND : " + kind + ", NUM : " + num;
		
	}
	
}
