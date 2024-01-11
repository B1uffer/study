package 객체지향_프로그래밍2;

public class ex23_객체를배열로다루기2 {

	public static void main(String[] args) {
		// 이 메인과 관련된 클래스들은 전부 뒤에 3이 붙음
		
		Buyer3 b = new Buyer3();
		Tv3 tv = new Tv3();
		Computer3 com = new Computer3();
		Audio3 audio = new Audio3();
		
		b.buy(tv);
		b.summary();
		System.out.println();
		
		b.buy(com);
		b.summary();
		System.out.println();
		
		b.buy(audio);
		b.summary();
		System.out.println();
		
		b.refund(com);
		b.summary();

	}

}
