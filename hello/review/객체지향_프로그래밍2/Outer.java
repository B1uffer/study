package 객체지향_프로그래밍2;

public class Outer {
	// ex34
	
	// 인스턴스 클래스
	class InstanceInner {
		int iv = 100;
		
		
	}
	
	static class StaticInner {
		int iv = 200;
		static int cv = 300;
		
	}
	
	void myMethod() {
		
		// 얘도 인스턴스 클래스인데 메서드 내 클래스니까 지역클래스임
		class LocalInner {
			int iv = 400;
			
		}
	}
}
