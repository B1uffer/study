package 변수;

public class ex5 {

	public static void main(String[] args) {
		
		String url = "www.codechobo.com";
		
		float f1 = .10f;		// 0.10, 1.0e-1
		float f2 = 1e1f;		// 10.0, 1.0e1, 1.0e+1
		float f3 = 3.14e3f;
		double d = 1.23456789;
		
				// 실수형은 %f가 주로 쓰이며 %e는 지수로 표현할 때, %g는 값을 간략하게 표현할 때
		
		System.out.printf("f1 = %f, %e, %g%n", f1, f1 ,f1);
		System.out.printf("f2 = %f, %e, %g%n", f2, f2, f2);
		System.out.printf("f3 = %f, %e, %g%n", f3, f3, f3);
		
		System.out.printf("d = %f%n", d);	// %f(부동 소수점)는 소수점 6자리까지만 표현함
		System.out.printf("d = %14.10f%n", d);
		System.out.printf("[12345678901234567890]%n");
		System.out.printf("[%s]%n", url);		// %s는 문자열
		System.out.printf("[%20s]%n", url);		// 최소 20글자 출력공간 확보(우측정렬)
		System.out.printf("[%-20s]%n", url);	// 최소 20글자 출력공간 확보(좌측정렬)
		System.out.printf("[%.8s]%n", url);	// 왼쪽에서 8글자만 출력

	}

}
