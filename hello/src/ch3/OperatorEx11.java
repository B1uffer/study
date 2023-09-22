package ch3;						// 아스키 코드를 활용하여 문자를 통한 사칙연산

public class OperatorEx11 {

	public static void main(String[] args) {
		char a = 'a';
		char d = 'd';
		char zero = '0';
		char two = '2';
		
		System.out.printf("'%c' - '%c' = %d%n", d, a, d - a);		// char 타입의 d와 a를 뺀 값
		System.out.printf("'%c' - '%c' = %d%n", two, zero, two - zero);
		System.out.printf("'%c' = %d%n", a, (int)a);		// a의 아스키 코드값인 97이 출력된다
		System.out.printf("'%c' = %d%n", d, (int)d);		// d의 아스키 코드값인 100이 출력된다
		System.out.printf("'%c' = %d%n",  two, (int)two);
		System.out.printf("'%c' = %d%n", zero, (int)zero);
		
		
		System.out.print((char)72);
		System.out.print((char)101);
		System.out.print((char)108);
		System.out.print((char)108);
		System.out.print((char)111);
		System.out.print((char)44);
		System.out.print((char)32);
		System.out.print((char)87);
		System.out.print((char)111);
		System.out.print((char)114);
		System.out.print((char)108);
		System.out.print((char)100);
		System.out.print((char)33);
	
	
	}

}
