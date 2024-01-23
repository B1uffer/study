package 예외처리;

public class ex13_메서드에_예외_선언하기3 {

	public static void main(String[] args) {
		
		method1();

	}

	static void method1() {
		
		try {
			
			throw new Exception();
			
		} catch(Exception e) {
			
			System.out.println("ㅋㅋ");
			// e.printStackTrace();
			
		/*  java.lang.Exception
			at 예외처리.ex13_메서드에_예외_선언하기3.method1(ex13_메서드에_예외_선언하기3.java:15)
			at 예외처리.ex13_메서드에_예외_선언하기3.main(ex13_메서드에_예외_선언하기3.java:7)
			
			*/
			
		}
		
	}
}
