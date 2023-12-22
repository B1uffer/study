package 객체지향_프로그래밍1;

public class ex02_메서드사용법2 {

	public static void main(String[] args) {
		
		// Tv t1; t1 = new Tv(); 를 한문장으로 요약한 것임
		// Tv t1;
		// t1 = new Tv();
		
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		System.out.println("t1의 channel값은 " + t1.channel + " 입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + " 입니다.");
		
		t1.channel = 7;
		System.out.println("t1의 channel값을 7로 변경했습니다.");
		
		System.out.println("t1의 channel값은 " + t1.channel + " 입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + " 입니다.");

	}

}
