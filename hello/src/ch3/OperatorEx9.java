package ch3;						// OperatorEx8과 비슷함

public class OperatorEx9 {

	public static void main(String[] args) {
		long a = 1_000_000 * 1_000_000;		// 핵심은 연산을 한 결과값이 int이면 long 변수에 저장을 해도 오버플로우가 발생한 채로 저장된다.
		long b = 1_000_000 * 1_000_000L;	// 연산 과정에서 L, 즉 한쪽을 long값으로 지정해주면 더 큰 타입으로 계산이 되기 때문에 int가 아닌 long타입으로 결과값이 출력된다.

		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

}
