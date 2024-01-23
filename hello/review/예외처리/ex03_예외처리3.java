package 예외처리;

public class ex03_예외처리3 {

	public static void main(String[] args) {
		
		int number = 100;
		int result = 0;
		
		for(int i = 0; i < 10; i++) {
			
			try {
				
				result = number / (int)(Math.random() * 10);	// 예외가 발생할 수 있는 코드
				System.out.println(result);
				
			} catch (ArithmeticException e) {	// 그 예외가 발생했을 때(ArithmeticException)
				
				System.out.println("0");		// 0을 출력함
				
			}
			
		} // for문 끝

	}
	
}


		// 매커니즘
		// 가령 for문 두 바퀴 째에서 오류가 발생했을 때(i = 1),
		// ArithmeticException이라는 예외가 발생했기 때문에 이에 해당하는 catch 블럭을 찾아서 블럭 내 문장을 실행한다.
		// 그 후에 try - catch문을 벗어나(catch블럭을 실행한 후에) for문의 다음 반복(i = 2 ~ 9)을 계속 수행하여 작업을 진행한다.
		// Math.random()이기 때문에 예외 ArithmeticException이 발생했을 경우 해당 try - catch문을 반복한다
		
		// 만약 이 try - catch문을 작성하지 않았을 경우 이용자의 프로그램이 비정상적으로 종료되는 개 좆같은 경우를 겪을 수 있다
