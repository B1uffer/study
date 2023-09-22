package ch3;						//

public class OperatorEx16 {

	public static void main(String[] args) {
		float pi = 3.141592f;
		float shortPi = (int)(pi * 1000) / 1000f;		// int형간 나눗셈 int / int 를 수행하면 결과값은 int가 된다. 실수형 float, double형이 아니다.
														// 나눗셈의 결과값을 반올림 하는것이 아닌 버리게 된다.
		System.out.println(shortPi);					// 괄호 수식이 제일 먼저 수행되므로 pi * 1000인 3141.592f가 됨
	}													// 그리고 이를 형변환하게 되니까 소수점을 전부 버리면 3141이 된다
														// 마지막으로 이를 1000f로 나누면 float가 되니까 3141 / 1000f, 3.141f가 됨
}
