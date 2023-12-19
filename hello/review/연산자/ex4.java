package 연산자;

public class ex4 {

	public static void main(String[] args) {
		// 부호연산자 +, - 에서 -는 부호를 반대로 변경한 결과를 반환함
		int i = -10;
		i = +i;
		System.out.println(i);	// 부호연산자는 boolean형, char형에 사용할 수 없다
		
		i = -10;
		i = -i;
		System.out.println(i);
		
	}

}
