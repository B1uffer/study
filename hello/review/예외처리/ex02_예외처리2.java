package 예외처리;

public class ex02_예외처리2 {

	public static void main(String[] args) {
		
		int number = 100;
		int result = 0;
		
		for(int i = 0; i < 10; i++) {
			
			result = number / (int)(Math.random() * 10); // 12번째 줄
			System.out.println(result);
			
		}

		// Exception in thread "main" java.lang.ArithmeticException: / by zero
		// at 예외처리.ex02_예외처리2.main(ex02_예외처리2.java:12)
		// 0으로 나누려고 하면 발생하는 예외
		// 이 에러는 첫줄을 보면 알겠지만 ArithmeticException이다
		// ex02_예외처리2.java:12 << 12번째 줄에서 예외가 발생했다는 소리임
		// 만약 정수값인 int가 아닌 float 같은 실수형으로 계산한다면 예외가 발생하지 않는다
	}

}
