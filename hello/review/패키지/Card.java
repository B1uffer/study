package 패키지;

public class Card {
	
	String Kind;		// 종류
	int Number;			// 숫자
	
	Card(String kind, int number) {
		
		this.Kind = kind;
		this.Number = number;
		
	}
	
	Card() {
		
		this("SPADE", 1);
		
	}
	
	//public String toString() {
		
	//	return Kind + " / " + Number;
		
	//}
	
	
}
