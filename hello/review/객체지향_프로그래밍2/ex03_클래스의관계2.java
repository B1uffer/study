package 객체지향_프로그래밍2;

public class ex03_클래스의관계2 {

	public static void main(String[] args) {
		
		// card, deck 참조
		
		Deck d = new Deck();		// 덱을 만듬
		Card c = d.pick(0);			// 섞기 전, 맨 위 카드를 뽑음
		System.out.println(c.toString());      // System.out.println(c);와 같음
		// c.toString이므로 card에 있는 toString 참조
		
		d.shuffle(); // 셔플
		c = d.pick(0); // 맨 위 카드를 뽑음
		System.out.println(c.toString());
		

	}

}
