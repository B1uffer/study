package 패키지;

import static java.lang.Math.*;
import static java.lang.System.*;

public class ex21_MathException_Exact {

	public static void main(String[] args) {
		
		int i = Integer.MIN_VALUE;
		int i2 = Integer.MAX_VALUE;
		
		System.out.println(i2);
		System.out.println();
		
		out.println(i);
		out.println((-i));
		
		
		try {
			
			out.printf("negateExact(%d) = %d%n", 10, negateExact(10));
			out.printf("negatExact(%d) = %d%n", -10, negateExact(-10));
			out.printf("negateExact(%d) = %d%n", i, negateExact(i));		// negateExact(i) = -i
			
		} catch(ArithmeticException ae) {
			
			out.printf("negateExact(%d) = %d%n", (long)i, negateExact((long)i));
			// int값이면 ArithmeticException 예외로 인한 코드에서도 예외가 발생하기 때문에 long값으로 바꿔주어 오버플로우를 예방한다
			
		}
	}

}
