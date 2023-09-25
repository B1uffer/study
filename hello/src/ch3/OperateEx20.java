package ch3;						// 나머지 연산자 % 다른 예제들

public class OperateEx20 {

	public static void main(String[] args) {
		System.out.println(10%8);
		System.out.println(-10%8);		// 10%8을 계산하여 2가 나온 후 피연산자의 부호인 -를 붙인 과정
		System.out.println(10%-8);		// 나머지 연산자 %는 나누는 수를 음수로 해도 성립한다.	10/-8 = 10 * 1/-8
		System.out.println(-10%-8);		// 피연산자의 부호를 모두 무시하고, 나머지 연산을 한 결과에 피연산자의 부호를 붙이면 됨.
	
	}	
}
