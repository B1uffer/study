package ch3;						// int로 먼저 계산하는 것과 나중에 계산하는 것의 차이

public class OperatorEx10 {

	public static void main(String[] args) {
		int a = 1_000_000;
		
		int result1 = a * a / a;
		int result2 = a / a * a;
		
		System.out.println(result1);
		System.out.println(result2);
		
		System.out.printf("%d * %d / %d = %d%n", a, a, a, result1);		// 전자의 경우 먼저 곱하고 나누기 때문에 int타입을 초과해서 오버플로우가 발생
		System.out.printf("%d / %d * %d = %d%n", a, a, a, result2);		// 후자의 경우 먼저 나누고 곱하기 때문에 int타입을 초과하지 않아서 오버플로우가 발생하지 않음
		

	}

}
