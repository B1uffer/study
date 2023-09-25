package ch3;						// 효율적인 연산

public class OperateorEx26 {

	public static void main(String[] args) {
		int a = 5;
		int b = 0;
		
		System.out.printf("a = %d, b = %d%n", a, b);
		System.out.printf("a != 0 || ++b != 0 = %b%n", a != 0 || ++b != 0);		// a가 0과 다르거나, 혹은 b에서 1만큼 증가시킨 값이 0과 다르다면 true
		System.out.printf("a = %d,b = %d%n", a, b);
		System.out.printf("a == 0 && ++b != 0 = %b%n", a ==0 && ++b != 0);		// a가 0이고, 1만큼 b에 더한 값이 0과 같다면 true, 그 외엔 false
		System.out.printf("a = %d, B = %d%n", a, b);
		
		// 증감연산자 ++를 사용한 후에 b의 값을 확인해도 0인채로 남아있는데, 
		// 이는 || 출력했을땐 어느 한쪽만 true이면 true라서 ++b != 0 값을 평가하지 않았고, 
		// &&을 출력했을 땐 a == 0이 false이기 때문에 ++b != 0 을 평가하지 않았기 때문이다.

	}	// main의 끝

}
