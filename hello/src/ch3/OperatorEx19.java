package ch3;						// 나머지 연산자 % : 왼쪽의 피연산자를 오른쪽 피연산자로 나누고 난 나머지 값을 결과로 반환하는 연산자. 나누는 수는 0이 될 수 없다.

public class OperatorEx19 {

	public static void main(String[] args) {
		int x = 10;
		int y = 8;
		
		System.out.printf("%d를 %d로 나누면, %n", x, y);
		System.out.printf("몫은 %d이고, 나머지는 %d입니다!", x / y, x % y);			// x / y에서 / 나누기 연산자는 몫을, % 연산자는 나머지를 나타내준다.

	}

}
