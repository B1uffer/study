package 객체지향_프로그래밍1;

public class ex5_변수와메서드 {

	public static void main(String[] args) {
		
		// 클래스 변수(static)는 객체생성 없이 '클래스이름.클래스변수'로 직접 사용 가능하다.
		// ex) card.width, card.height
		System.out.println("Card.width = " + card.width);
		System.out.println("Card.height = " + card.height);

		// 인스턴스 변수 c1
		card c1 = new card();
		// 인스턴스 변수의 값을 변경
		c1.kind = "heart";
		c1.number = 7;
		
		// 인스턴스 변수 c2
		card c2 = new card();
		// 인스턴스 변수의 값을 변경
		c2.kind = "Spade";
		c2.number = 4;

		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ") 입니다.");
		System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ") 입니다.");

		System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
		// 클래스 변수의 값을 변경
		c1.width = 50;
		c1.height = 80;

		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ") 입니다.");
		System.out.println("c2는 " + c2.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c2.height + ") 입니다.");

	}

}
