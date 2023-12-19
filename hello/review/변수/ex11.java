package 변수;

public class ex11 {

	public static void main(String[] args) {
		
		float f = 9.1234567f;
		// float 클래스의 floatToIntBits()는 float 타입의 값을 int 타입의 값으로 해석해서 반환함.
		// 반환된 값을 16진수로 출력하면 float 타입의 값이 2진수로 어떻게 저장되는지 확인할 수 있음
		int i = Float.floatToIntBits(f);
		
		System.out.printf("%f%n", f);
		System.out.printf("%X%n", i);
	}

}
