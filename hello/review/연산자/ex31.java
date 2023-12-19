package 연산자;

public class ex31 {

	public static void main(String[] args) {
		
		int dec = 1234;
		int hex = 0xABCD;
		int mask = 0xF;
		
		System.out.printf("hex = %X%n", hex);
		System.out.printf("%x%n", hex & mask);
		
		hex = hex >> 4;		// hex = 0x0ABC;
		System.out.printf("%X%n", hex & mask);
		
		hex = hex >> 4;		// hex = 0x00AB;
		System.out.printf("%X%n", hex & mask);
		
		hex = hex >> 4;		// hex = 0x000A;
		System.out.printf("%X%n", hex & mask);
		
		
	}

}
