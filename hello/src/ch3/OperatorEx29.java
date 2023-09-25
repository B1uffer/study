package ch3;						// 비트 전환 연산자 ~ : ~에 의해 비트전환 되면, 부호잇는 타입의 피연산자는 부호가 반되가 된다. 즉 피연산자의 1의 보수를 얻을 수 있음

public class OperatorEx29 {

	public static void main(String[] args) {
		
		byte p = 10;
		byte n = -10;
		
		System.out.printf(" p = %d \t%s%n", p, toBinaryString(p));
		System.out.printf("~p = %d \t%s%n", ~p, toBinaryString(~p));
		System.out.printf("~p + 1 = %d \t%s%n", ~p+1, toBinaryString(~p+1));
		System.out.println();
		System.out.printf("n = %d%n", n);
		System.out.printf("~(n-1) = %d%n", ~(n-1));				// n-1의 보수, -10-1 = -11, -11의 보수는 10
		System.out.printf("~n = %d%n", ~n);

	}

	// 10진 정수를 2진수로 변환하는 메서드
	static String toBinaryString(int x)	{
		
		String zero = "0000000000000000000000000000000";
		String tmp = zero + Integer.toBinaryString(x);
		return tmp.substring(tmp.length() -32);
	}
	
	
}
