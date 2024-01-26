package 예외처리;

public class ex22_예외되던지기 {

	public static void main(String[] args) {
		
		try {
			
			// method1();
			method3();
			
		} catch(Exception e) {
			
			System.out.println("main에서 예외가 처리됨");
			
		}

	}

	
	static void method1() throws Exception {
		
		try {
			
			throw new Exception();		// 예외를 발생시킴
			
		} catch(Exception e) {
			
			System.out.println("method1에서 예외가 처리됨");
			throw e;		// 예외를 발생시킴
			
		}
		
	}
	
	
	static int method2() {
		
		try {
			
			System.out.println("method2()가 호출됨");
			return 0;		// 반환값이 있는 메서드는 return이 적혀야 하는데
			
		} catch(Exception e) {
			
			e.printStackTrace();
			return 1;		// try뿐만 아니라 catch에도 적혀야한다
			
			
		} finally {
			
			System.out.println("method2()의 finally가 실행됨");
			
		}
		
	}
	
	
	static int method3() throws Exception {
		
		try {
			
			System.out.println("method3()이 호출됨");
			throw new Exception();
			//return 0;
			
		} catch(Exception e) {
			
			e.printStackTrace();
			// return 1;		// 밑에 throw new Exception(); 이 없을 때, return문을 적어줘야한다
			throw e;		// 예외 되던지기를 통해 호출한 메서드로 예외를 전달하면, 위의 return이 필요없다
			
		} finally {
			
			System.out.println("method3()의 finally가 실행됨");
			
		}
		
	}
}
