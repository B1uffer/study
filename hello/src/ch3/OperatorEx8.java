package ch3;						// long타입과 int타입

public class OperatorEx8 {

	public static void main(String[] args) {
		int a = 1_000_000;
		int b = 2_000_000;
		
		long c = a * b;				// 1,000,000 * 2,000,000 = 2,000,000,000,000
		
		System.out.println(c);		// 산술연산자 *를 이용해서 계산하면 int값으로 출력되기 때문에 long값으로 담지 않는것

		long c2 = (long)a * b;
		System.out.println(c2);
		
		long c3 = a * (long)b;
		System.out.println(c3);

	}

}
