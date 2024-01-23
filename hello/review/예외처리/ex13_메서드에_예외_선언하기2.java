package 예외처리;

public class ex13_메서드에_예외_선언하기2 {

	public static void main(String[] args) throws Exception {
		
		method1();

	}
	
	static void method1() throws Exception {
		
		try {
			
			method2();
			
		} catch(Exception e) {
			
			System.out.println("예외처리 완료!");
			// e.printStackTrace();
			
			/* java.lang.Exception
			at 예외처리.ex13_메서드에_예외_선언하기2.method2(ex13_메서드에_예외_선언하기2.java:30)
			at 예외처리.ex13_메서드에_예외_선언하기2.method1(ex13_메서드에_예외_선언하기2.java:15)
			at 예외처리.ex13_메서드에_예외_선언하기2.main(ex13_메서드에_예외_선언하기2.java:7)
			*/
			
		}
		
		
	}
	
	static void method2() throws Exception {
		
		throw new Exception();
		
	}

}
