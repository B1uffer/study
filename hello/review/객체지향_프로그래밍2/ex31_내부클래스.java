package 객체지향_프로그래밍2;

public class ex31_내부클래스 {

	class InstanceInner {
		int iv = 100;
		// static int cv = 100;  static 변수를 선언할 수 없음
		
		// final static은 상수이기 때문에 내부 클래스에서 허용한다
		final static int CONST = 100;
		
		
	}
	
	static class StaticInner {
		
		int iv = 200;
		static int cv = 200;		// static 클래스이기 때문에 static멤버를 정의할 수 있음
		
	}
	
	void myMethod() {
		
		class LocalInner {
			int iv = 300;
			// static int cv = 300;		메서드 안에서 정의된 로컬 클래스이기 때문에 static멤버를 정의할 수 없음
			
			final static int CONST = 300;		// 얘는 상수
			
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(InstanceInner.CONST);	// 내부 클래스 InstanceInner에 있는 CONST
		System.out.println(StaticInner.cv);			// 내부 클래스 StaticInner에 있는 cv
		

	}

}
