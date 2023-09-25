package ch3;					// 비교연산자 : 대소비교 연산자 <, >, <=, >= // 등가비교 연산자 ==, !=

public class OperatorEx22 {

	public static void main(String[] args) {
		float f = 0.1f;
		double d = 0.1;
		double d2 = (double)f;
		
		System.out.println(d2);
		
		System.out.printf("10.0 == 10.0f %b%n", 10.0 == 10.0f);
		System.out.println(10.0 == 10.0f);
		System.out.printf("0.1 == 0.1f %b%n", 0.1 == 0.1f);		// 정수형과 달리 실수형은 근사값으로 저장되므로 오차가 발생할 수 밖에 없다
		System.out.printf("f = %19.17f%n", f);		// 0.1f는 float형에서 double형으로 저장할 때 2진수로 변환하는 과정에서 오차가 발생하기 때문에
		System.out.printf("d = %19.17f%n", d);
		System.out.printf("d2 = %19.17f%n", d2);		// float형에서 정밀도가 더 높은 double형으로 변환해도 오차가 적어지지 않는다.
		System.out.printf("d == f %b%n", d==f);			// 과정은 책 p.111 참고
		System.out.printf("d == d2 %b%n", d==d2);
		System.out.printf("d2 == f %b%n", d2==f);		//true
		System.out.printf("(float)d == f %b%n", (float)d == f);		// float와 double의 값을 비교하려면 double을 float값으로 형변환 해주어야함 p.112 참고
	}

}
