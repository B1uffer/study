package ch3;						// 작은 자료형 변수 (ex : byte)로 계산해서 큰 자료형 변수(ex : int)에 저장하면 자동으로 형변환이 되기 때문에 오류가 발생하지 않는다.

public class OperatorEx7 {

	public static void main(String[] args) {
		byte a = 10;
		byte b = 30;
		byte c = (byte)(a * b);
		
		System.out.println(c);

		int c2 = (a * b);
		System.out.println(c2);
	}

}
