package 연산자;

public class ex6 {

	public static void main(String[] args) {
		
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a + b);		// byte c = a + b는 오류가 발생하니까 (byte) 로 형변환함
		System.out.println(c);
		
	}

}
