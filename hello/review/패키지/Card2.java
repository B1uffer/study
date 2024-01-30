package 패키지;

public class Card2 {
	
	String Kind;
	int Number;
	
	Card2(String kind, int number) {
		
		this.Kind = kind;
		this.Number = number;
		
	}
	
	Card2() {
		
		this("SPADE", 1);
		
	}
	
	public String toString() {
		// object 클래스에 정의된 toString()의 접근제어자가 public이기 때문에 오버라이딩하는 toString()의 접근제어자도 public이어야함
		return "kind : " + Kind + ", number : " + Number;
		
	}
	
}
