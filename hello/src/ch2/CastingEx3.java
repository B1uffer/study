package ch2;						// 실수형간의 형변환을 하는 방법

public class CastingEx3 {

	public static void main(String[] args) {
		
		float f = 9.1234567f;
		double d = 9.1234567;
		double d2 = (double)f;
		
		System.out.printf("f = %20.18f\n", f);				// 소숫점 20자리의 수까지에서 18자리까지만 표현함.
		System.out.printf("d = %20.18f\n", d);
		System.out.printf("d2 = %20.18f\n", d2);
		
		
		

	}

}
