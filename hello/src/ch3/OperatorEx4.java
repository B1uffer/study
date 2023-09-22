package ch3;						// 부호 연산자 + , -

public class OperatorEx4 {

	public static void main(String[] args) {
		int i = -10;
		i = +i;
		System.out.println(i);				//부호연산자 +는 부호를 반대로 변경하지 않는다. 하는 일도 없으며 쓰이는 경우도 거의 없음
		
		i = -10;
		i = -i;
		System.out.println(i);				// 부호연산자 -는 해당 변수의 값을 반대로 변경한다. 변수가 음수면 양수로, 양수면 음수로 변경한다.
											
											// 부호연산자는 boolean형과 char형을 제외한 기본형에만 사용할 수 있다
	}

}
