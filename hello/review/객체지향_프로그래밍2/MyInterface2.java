package 객체지향_프로그래밍2;

public interface MyInterface2 {		// default 메서드는 인터페이스에서만 된다.. 클래스에선 안됨
	
	default void method1() {
		System.out.println("method1() in MyInterface2! :A");
		
	}
	
	// static void
	static void staticMethod() {
		
		System.out.println("this is staticMethod() in MyInterface2! :F");
	}
}
