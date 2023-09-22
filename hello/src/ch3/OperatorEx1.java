package ch3;						// 단항 연산자 중 증감 연산자 ++, --

public class OperatorEx1 {

	public static void main(String[] args) {
		int i = 5;
		i++;			// i = i + 1;과 같은 의미. i++와 ++i는 결과값이 같다.
		System.out.println(i);
		System.out.println("i = " + "" + i);
		
		i = 5;			// 비교를 위해 i를 5로 변경.
		++i;
		System.out.println(i);

	}

}
