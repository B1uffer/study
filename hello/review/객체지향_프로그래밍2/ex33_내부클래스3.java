package 객체지향_프로그래밍2;

public class ex33_내부클래스3 {
	// 내부 클래스의 제어자와 접근성에 대해 2
	
	private int outerIv = 0;		// 외부 클래스의 private 멤버
	static int outerCv = 0;
	
	class InstanceInner {
		int iiv = outerIv;		// 외부 클래스의 private멤버도 접근이 가능함
		
		int iiv2 = outerCv;
		
	}
	
	static class StaticInner {
		
		// static class는 외부 클래스의 인스턴스멤버에 접근이 불가능함
		// int siv = outerIv;
		
		static int scv = outerCv;
		
	}
	
	void myMethod() {
		int lv = 0;				// 외부 클래스의 메서드에 대한 지역변수
		final int LV = 0;		// final int이므로 상수
		
		class LocalInner {
			int liv = outerIv;
			int liv2 = outerCv;
			
			// 외부 클래스의 지역번수는 final이 붙은 변수만 접근이 가능한데 이제 그게 아니게 되었음
			int liv3 = lv; // JDK 1.8부터 에러가 아님
			int liv4 = LV;
			
		}
	}
}
