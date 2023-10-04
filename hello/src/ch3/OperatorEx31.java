package ch3;						// shift 연산자와 비트 AND 연산자를 이용해서 16진수를 끝에서부터 한자리씩 뽑아내는 예제

public class OperatorEx31 {

	public static void main(String[] args) {
		
		int dec = 1234;
		int hex = 0xABCD;
		int mask = 0xF;
		
		System.out.printf("hex = %X%n", hex);
		System.out.printf("%X%n", hex & mask);
		
		hex = hex >> 4;		// x >> n은 x / 2^n과 같다 즉 0xABCD / 2^4
		System.out.printf("%X%n", hex & mask);
		
		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask);
		
		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask);
		
		

	}		// main 끝

}
