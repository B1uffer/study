package ch3;						// 형변환을 하지 않았을 때 실행 시 오류가 뜨는지에 대한 여부

public class OperatorEx6 {

	public static void main(String[] args) {
		byte a = 10;			// 00001010
		byte b = 20;			// 00010100
		byte c = (byte)(a + b);			// 10 + 20 = 30, 00011110		// a, b는 byte값을 가지는데 + 연산자는 계산하면서 a와 b를 int형으로 저장해버린다.
		System.out.println(c);									// 그래서 오류가 발생하는 것이기 때문에 우항인 a + b를 한데 묶어서 byte값으로 형변환 해주어야한다.

	}

}
