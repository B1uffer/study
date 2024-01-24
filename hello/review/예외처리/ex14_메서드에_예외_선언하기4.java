package 예외처리;

public class ex14_메서드에_예외_선언하기4 {

	public static void main(String[] args) {
		
		try {
			method1();
			
		} catch(Exception e) {
			
			System.out.println("main메서드에서 예외 처리 완료");
			
			e.printStackTrace();
			/*
			 
			    java.lang.Exception
				at 예외처리.ex14_메서드에_예외_선언하기4.method1(ex14_메서드에_예외_선언하기4.java:22)
				at 예외처리.ex14_메서드에_예외_선언하기4.main(ex14_메서드에_예외_선언하기4.java:8)

			 */
		}

	}
	
	
	static void method1() throws Exception {
		throw new Exception();
	}

}
