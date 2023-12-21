package 객체지향_프로그래밍1;

public class ex19_클래스변수와인스턴스변수 {

	public static void main(String[] args) {
		
		// MyMath2를 참조하면서 보기
		
		// 클래스 메서드 호출하기. 인스턴스의 생성 없이 호출 가능함
		System.out.println(MyMath2.add(200L, 100L));
		System.out.println(MyMath2.subtract(200L, 100L));
		System.out.println(MyMath2.multiply(200L, 100L));
		System.out.println(MyMath2.divide(200.0, 100.0));
		System.out.println();
		
		// 인스턴스 생성
		MyMath2 mm = new MyMath2();
		
		// 변수
		mm.a = 200L;
		mm.b = 100L;
		
		// 인스턴스 메서드는 객체생성 후에만 호출이 가능하다
		// 윗작업을 안해놓으면 할 수 없는 출력
		// 변수 설정 안해두면 걍 0으로 나온다
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
		

	}

}
