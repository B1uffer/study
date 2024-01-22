package 객체지향_프로그래밍2;

public class ex36_익명클래스 {
	
	Object iv = new Object() {
		
		void method() {
			
		}
		
	};		// 익명 클래스...... Object 타입의 iv의 선언과 Object() 타입의 구현 void method() { }을 동시에 하고 있다
	
	static Object cv = new Object() { void method() { } };		// 얘도 익명 클래스
	
	void myMethod() {
		
		Object lv = new Object() { void method() { } };		// 얘도 익명 클래스. 메서드 안에서도 정의가 되나보다
		
	}
}
