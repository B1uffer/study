package ch3;						// 비교연산자 : 대소비교 연산자 <, >, <=, >= // 등가비교 연산자 : ==, !=

public class OperatorEx21 {

	public static void main(String[] args) {
		System.out.printf("10 == 10.0f \t %b%n", 10==10.0f);
		System.out.printf("'0' == 0 \t %b%n", '0'==0);
		System.out.printf("'A' == 65 \t %b%n", 'A'==65);
		System.out.printf("'A' > 'B' \t %b%n", 'A'>'B');		// 'A'의 유니코드는 65, 'B'의 유니코드는 66이므로 'A'>'B'는 65>65이므로 false
		System.out.printf("'A' + 1 != 'B' \t %b%n", 'A'+1 != 'B' );		// 'A'+1의 값은 65+1 = 66, 'B'의 값은 66이므로 true가 나온다.

	}

}