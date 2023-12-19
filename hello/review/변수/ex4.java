package 변수;

public class ex4 {

	public static void main(String[] args) {
		
		byte b = 1;
		short s = 2;
		char c = 'A';
		
		int finger = 10;
		long big = 100_000_000_000L;		// long big = 100000000000L; 와 같다
		long hex = 0xFFFF_FFFF_FFFF_FFFFL;	// 0x는 16진법

		int octNum = 010;		// 0이 붙어있으니 010은 8진수 10, 10진수로는 8
		int hexNum = 0x10;		// 0x가 붙어있으니 0x10는 16진수 10, 10진수로는 16
		int binNum = 0b10;		// 0b가 붙어있으니 2진수 10, 10진수로는 2
		
		System.out.printf("b = %d%n", b);
		System.out.printf("s = %d%n", s);
		System.out.printf("c = %c, %d%n", c, (int)c);	// 자바에서는 char 타입의 값을 %d로 출력할 수 없다.
			// 따라서 char 타입은 %d로 출력할 때 (int)c와 같이 형변환을 해주어야 한다.
		System.out.printf("finger = [%5d]%n", finger);
		System.out.printf("finger = [%-5d]%n", finger);
		System.out.printf("finger = [%05d]%n", finger);
		System.out.printf("big = %d%n", big);
		System.out.printf("hex = %#x%n", hex);		// '#'은 접두사(16진수는 0x, 8진수는 0)
		System.out.printf("octNum = %o, %d%n", octNum, octNum);
		System.out.printf("hexNum = %h, %d%n", hexNum, hexNum);
		System.out.printf("binNum = %s, %d%n", Integer.toBinaryString(binNum), binNum);
			// 10진수를 2진수로 출력해주는 지시자는 없기 때문에
			// 정수를 2진수 문자열로 변환해주는 Integer.toBinaryString(int i)을 사용했음.
		
	}

}
