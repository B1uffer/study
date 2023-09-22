package ch2;

public class PrintfEx1 {

	public static void main(String[] args) {
		
		byte b = 1;
		short s = 2;
		char c = 'A';
		
		int finger = 10;
		long big = 100_000_000_000L;		// long big = 100000000000L;
		Long hex = 0xFFFF_FFFF_FFFF_FFFFL;
		
		int octNum = 010;		// 8진수 10, 10진수로는 8
		int hexNum = 0x10;		// 16진수 10, 10진수로는 16
		int binNum = 0b10;		// 2진수 10, 10진수로는 2
		
		System.out.printf("b=%d%n", b);		// 정수형의 값을 printf();로 출력하는 예제
		System.out.printf("s=%d%n", s);
		System.out.printf("c=%c, %d %n", c, (int)c);
		System.out.printf("finger=[%5d]%n", finger);
		System.out.printf("finger=[%-5d]%n", finger);
		System.out.printf("finger=[%05d]%n", finger);
		System.out.printf("big=%d%n", big);
		System.out.printf("hex=%#x%n", hex);
		System.out.printf("octNum=%o, %d%n", octNum, octNum);	// 8진수와 10진수
		System.out.printf("hexNum=%x, %d%n", hexNum, hexNum);	// 16진수와 10진수
		System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum);	// Integer.toBinaryString 2진수를 문자열로 바꾼것(변환)
		System.out.printf("c=%c, %d%n", c, (int)c);	// char타입의 값을 %d 지시자로 출력하고 싶으면 int 타입으로 형변환 해야한다
	}

}
