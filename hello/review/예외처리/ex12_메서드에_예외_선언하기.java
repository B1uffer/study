package 예외처리;

public class ex12_메서드에_예외_선언하기 {

	public static void main(String[] args) throws Exception {
		
		method1();									// 3
		
									// main에도 try - catch문으로 예외처리를 해주지 않음
									// 따라서 main이 종료되고 프로그램이 꺼진다!
		
	}
	
	static void method1() throws Exception {		// 2
		
		method2();
		
									// method1()에서도 try - catch문을 통해 예외처리를 해주지 않음
									// 따라서 method1()을 부른 main에게 전가하고 method1()은 종료됨
		
	}
	
	static void method2() throws Exception {		// 1
		
		throw new Exception();		// 얘가 예외를 강제적으로 발생시킴
									// 그러나 try - catch문으로 예외처리를 해주지 않음
									// method2()는 종료되고 이를 method2()를 호출한 method1()에게 전가함
		
	}

}


		/* Exception in thread "main" java.lang.Exception
		at 예외처리.ex13_메서드에_예외_선언하기.method2(ex13_메서드에_예외_선언하기.java:19)
		at 예외처리.ex13_메서드에_예외_선언하기.method1(ex13_메서드에_예외_선언하기.java:13)
		at 예외처리.ex13_메서드에_예외_선언하기.main(ex13_메서드에_예외_선언하기.java:7)
		*/ 


		// 호출 스택(call stack)
		// 예외가 발생했을 때, 모두 3개의 메서드(main, method1, method2)에 호출스택이 있었으며
		// 예외가 발생한 곳은 제~일 윗줄인 method2이며
		// main 메서드가 method1()을 호출했고 method1()은 method2()를 호출했다는 것을 알 수 있다
