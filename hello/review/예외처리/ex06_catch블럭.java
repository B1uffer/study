package 예외처리;

public class ex06_catch블럭 {

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		
		try {
			
			System.out.println(3);
			System.out.println(0/0);	// 여기서 예외 발생
			
			System.out.println(4);
			
		} catch(Exception e) {		// ArithmeticException이 아닌 그 조상 Exception
									// instanceof의 결과 true가 나오게 된다
			
			System.out.println(5);
			
		} // try - catch의 끝
		
		System.out.println(6);
		
	}

}
