package ch3;						// char형과 int형, 아스키 코드

public class OperatorEx12 {

	public static void main(String[] args) {
		char c1 = 'a';				// c1에는 문자 'a'의 코드값인 97이 저장.
		char c2 = c1;				// c1에 저장되어있는 값이 c2에도 저장된다
		char c3 = ' ';				// c3을 공백으로 한다.
		
		int i = c1 + 1;				// 'a' + 1 = 97 + 1 = 98
		
		c3 = (char) (c1 + 1);			// 사칙연산자의 결과값은 int로 출력되기 때문에 위의 char형 변수 c3에 담기 위해서는 char형으로의 변환이 필요함
		c2++;
		c2++;
		
		System.out.println("i = " + i );
		System.out.println("c2 = " + c2);				// char값인 c2는 'a'가 저장되어있는 97인데, ++을 두번 하여 99가 되었으니 char형으로 보면 a - > c가 되었다.
		System.out.println("c3 = " + c3);				// char값 97 + 1을 한 c3은 char형으로 보면 98, b가 된다
		
	}

}
