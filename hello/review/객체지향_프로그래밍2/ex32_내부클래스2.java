package 객체지향_프로그래밍2;

public class ex32_내부클래스2 {
	
		// 내부 클래스의 제어자와 접근성에 대해
	
	// 외부 클래스의 멤버변수 취급
	class InstanceInner {
		
	}
	
	static class StaticInner {
		
	}
	
	// 인스턴스 멤버간에는 서로 직접적인 접근이 가능함
	InstanceInner iv = new InstanceInner();
	
	// static 멤버간에도 서로 직접적 접근 가능
	StaticInner cv = new StaticInner();
	
	// 외부클래스의 메서드
	static void staticMethod() {
		// static멤버는 인스턴스멤버에 직접적 접근이 불가능함
		//InstanceInner obj1 = new InstanceInner();
		
		// 접근하기 위해서는 객체를 생성해야함
		// 인스턴스 클래스는 "외부 클래스"를 먼저 생성해야만 생성할 수 있음
		ex32_내부클래스2 outer = new ex32_내부클래스2();
		InstanceInner obj1 = outer.new InstanceInner();
		
		
		
		// static은 가능
		StaticInner obj2 = new StaticInner();
		
	}
	
	// 외부클래스의 메서드
	void instanceMethod() {
		
		// 인스턴스 메서드에서는 인스턴스멤버, static멤버 모두 접근이 가능함
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		
		// 메서드 내에서 지역적으로 선언된 내부 클래스는 외부에서 접근할 수 없음!
		// ex31의 내부 클래스
		//LocalInner lv = new LocalInner();
		
	}
	
	void myMethod() {
		class LocalInner {
			
		}
		
		LocalInner lv = new LocalInner();
		
	}
	

}
