package 예외처리;

public class ex07_catch블럭2 {

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		
		try {
			
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
			
		} catch(ArithmeticException ae) {
			
			if(ae instanceof ArithmeticException) {
				System.out.println("true");
				
			}
			
			System.out.println("ArithmeticException");
			
			
			ae.printStackTrace();
			// java.lang.ArithmeticException: / by zero
			// at 예외처리.ex07_catch블럭2.main(ex07_catch블럭2.java:13)
			
			System.out.println(ae.getMessage());  // / by zero가 출력됨
			
			// getMessage()는 그냥 에러가 왜 발생했는지만 말해줌
			
			
		} catch(Exception e) {
			
			System.out.println("Exception");
			
			
		}

		System.out.println(6);
		
	}

}


		// 메커니즘
		// 당연하게도 System.out.println(0/0); 에서 예외가 발생함
		// 이 예외는 ArithmeticException이므로 이에 대한 catch문을 찾게 됨
		// ArithmeticException 인스턴스를 생성하고 처음 만난 catch문이 ArithmeticException 타입의 ae 매개변수를 가진 catch인데
		// 이 catch문을 instanceof로 자동 판별해본 결과 true이므로 이 catch문을 전부 실행하기 시작함
		// 근데 그 안에 if문이 있다, ae 매개변수가 ArithmeticException 타입과 같을 경우, System.out.println("true"); 를 실행한다
		// 당연히 instanceof로 판별한 결과 true이므로 이게 실행되고,
		// if문을 빠져나온 후 System.out.println("ArithmeticException"); 을 실행한다
		// catch문을 실행했다는 것은 예외가 해결했다는 것을 의미하므로 
		
		// "그 즉시" 모든 catch문을 패스하고 try - catch문을 빠져나온다
		// 그리고 마지막에 System.out.println(6); 을 실행하고 프로그램 실행 끝!
