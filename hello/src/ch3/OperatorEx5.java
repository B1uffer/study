package ch3;							// 사칙 연산자 +, -, *, / (더하기, 빼기, 곱하기, 나누기)

public class OperatorEx5 {

	public static void main(String[] args) {
		int a = 10;
		int b = 4;
		
		System.out.printf("%d + %d = %d%n", a, b, a + b);
		System.out.printf("%d - %d = %d%n", a, b, a - b);
		System.out.printf("%d * %d = %d%n", a, b, a * b);
		System.out.printf("%d / %d = %d%n", a, b, a / b);		// 10 / 4 = 2, a와 b가 모두 정수형인 int이기 때문에 소수점 이하는 버려진다.
		System.out.printf("%d / %f = %f%n", a, (double)b, a / (double)b);		// 소수점을 표현하기 위해 실수형인 double과 float를 사용함.
		System.out.printf("%d / %f = %f%n", a, (float)b, a / (float)b);			// 정수형과 실수형을 함께 계산하면 실수형으로 표현이 된다.

	}

}
