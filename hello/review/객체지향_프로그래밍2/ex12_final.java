package 객체지향_프로그래밍2;

public class ex12_final {

	public static void main(String[] args) {
		
		// Card2 참조
		Card2 c = new Card2(10, "HEART");	// 초기화
		// c.NUMBER = 5; 와 같이 초기화를 할 수 없다. 선언과 함께 초기화되지 않으며 생성자에서 단 한 번 초기화 가능
		// 즉 새로 설정할 수 없다
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c);		// System.out.println(c.toString());

	}

}
