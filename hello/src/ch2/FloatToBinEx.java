package ch2;						// float 타입의 값이 실제로는 어떻게 저장되는가?

public class FloatToBinEx {

	public static void main(String[] args) {
		
		float f = 9.1234567f;
		int i = Float.floatToIntBits (f);		// f값은 앞서 지정한 f 일종의 치환. floatToIntBits(x)는 float 타입의 값을 int 타입의 값으로 해석해서 반환함 (float to int)
		
		System.out.printf("%f%n", f);
		System.out.printf("%X%n", i);		// 16진수로 출력한 것. 4111F9AE

	}

}
