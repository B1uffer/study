package 패키지;

import java.math.*;

public class ex43_java_math_BigInteger {

	public static void main(String[] args) throws Exception {
		
		// 1! ~ 99!까지 출력하는 예제
		// 정수형중에 가장 큰 long타입으로는 20!까지 계산할 수 있다
		
		for(int i=1; i<100; i++) {
			
			System.out.printf("%d! = %s%n", i, calcFactorial(i));
			Thread.sleep(300);		// 0.3초의 지연시간을 준다
			
		}
		
	}
	
	static String calcFactorial(int n) {
		
		return factorial(BigInteger.valueOf(n)).toString();
		
	}
	
	static BigInteger factorial(BigInteger n) {
		// 여기서 팩토리얼 계산함
		if(n.equals(BigInteger.ZERO)) {
			
			return BigInteger.ONE;
			// 0! = 1
			
		} else {
			
			return n.multiply(factorial(n.subtract(BigInteger.ONE)));
			// 얘는 한번만 실행하고 main에 보면 반복문이 있다
			
			// n! = n*(n-1)*(n-2)*...*1;
			
		}
		
	}
} 
