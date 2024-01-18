package 객체지향_프로그래밍2;

public interface MyInterface {
	
	default void method1() {
		System.out.println("method1() in interface! :D");
		
	}
	
	default void method2() {
		System.out.println("method2() in interface! :(");
		
	}
	
	// static void 
	static void staticMethod() {
		System.out.println("this is staticMethod() in MyInterface! :X");
		
	}
}
