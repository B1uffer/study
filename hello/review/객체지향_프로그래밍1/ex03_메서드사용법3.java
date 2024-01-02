package 객체지향_프로그래밍1;

public class ex03_메서드사용법3 {

	public static void main(String[] args) {
		
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		System.out.println("t1의 channel 값은 " + t1.channel + " 입니다.");
		System.out.println("t2의 channel 값은 " + t2.channel + " 입니다.");
		
		// t1이 저장하고 있는 값을 t2에 저장함
		t2 = t1;
		
		t1.channel = 7;
		System.out.println("t1의 channel값을 7로 변경했습니다.");
		
		System.out.println("t1의 channel 값은 " + t1.channel + " 입니다.");
		System.out.println("t2의 channel 값은 " + t2.channel + " 입니다.");

	}

}
