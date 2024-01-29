package 패키지;

public class ex02_equal2 {

	public static void main(String[] args) {

		// Person에서 매개변수의 타입이 중요함. 이걸 볼 때 참조하자
		
		Person p1 = new Person(1234567890L);
		Person p2 = new Person(1234567890L);

		if (p1 == p2) {

			System.out.println("p1과 p2는 같은 사람입니다.");
		} else {

			System.out.println("p1과 p2는 다른 사람입니다.");
		}
		
		
		if (p1.equals(p2)) {
			
			System.out.println("p1과 p2는 같은 사람입니다.");
			
		} else {
			
			System.out.println("p1과 p2는 다른 사람입니다.");
			
		}

	}

}