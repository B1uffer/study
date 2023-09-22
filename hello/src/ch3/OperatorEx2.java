package ch3;						// 단독으로 사용되지 않는 경우 전위형(++i)과 후위형(i++)의 결과는 다를 수 있다.

public class OperatorEx2 {

	public static void main(String[] args) {
		int i = 5, j = 0;
		
		j = i++;		// j = i가 먼저 실행된 후 i + 1이 실행되는 구조이다.
		System.out.println("j = i++; 실행 후, i = " + i + ", j = " + j);
		
		i = 5;
		j = 0;
		j = ++i;		// j = 1 + i 순으로 적혀있으므로 j = i가 나중에 실행된다. 즉 1 + i가 온전히 j값에 들어가는것.
		System.out.println("j = ++i; 실행 후, i = " + i + ", j = " + j);
	}

}
