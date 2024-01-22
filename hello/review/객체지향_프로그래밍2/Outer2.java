package 객체지향_프로그래밍2;

public class Outer2 {		// 외부 클래스
	
	// ex35
	
	int value = 10;		// 얘가 Outer2.this.value
	
	class Inner {	// 내부 클래스
		
		int value = 20;		// 얘가 this.value
		
		void method1() {
			int value = 30;		// 얘가 value
			
			System.out.println("value : " + value);
			System.out.println("this.value : " + this.value);		// this를 붙여줌으로써
			System.out.println("Outer.this.value : " + Outer2.this.value);
			// 외부 클래스와 내부 클래스의 인스턴스 변수 이름이 같을 경우 서로 구별할 수 있게 된다!
			// 3번째는 Inner가 내부 클래스이기 때문에 외부클래스.내부클래스.value 가 되는데 내부 클래스 자신을 불러오니까 this
			
		}
	}
	
}
