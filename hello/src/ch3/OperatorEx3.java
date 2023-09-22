package ch3;						// 메서드 호출에 증감연산자 (++, --)가 사용된 예

public class OperatorEx3 {

	public static void main(String[] args) {
		int i = 5, j = 5;
		System.out.println(i++);
		System.out.println(++j);
		
		System.out.println("i = " + i + ", j = " + j);		// 전위형 j = ++j의 경우 우항의 ++j에서 1을 먼저 더하고 좌항에 대입됨
															// 후위형 i = i++의 경우 우항의 i++에서 i가 먼저 좌항 i에 대입된 후에 좌항의 i에 1을 더해줌
		
	}

}
