package 연산자;

public class ex12 {

	public static void main(String[] args) {
		
		char c1 = 'a';	// 97
		char c2 = c1;	// 97
		char c3 = ' ';	// 공백
		
		int i = c1 + 1;	// char c1을 int로 자동 형변환뒤 계산 98
		c3 = (char)(c1 + 1);	// c1 + 1을 int로 계산 뒤 char로 형변환 b
		c2++;		
		c2++;
		
		System.out.println("i = " + i);
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);

	}

}
