package 조건문과_반복문;

public class ex31_continue문 {

	public static void main(String[] args) {
		
		for(int i=0; i<=10; i++) {
			if(i%3==0) {
				continue;	// continue문이 실행되면 다 통과하고 블럭의 끝으로 이동한 후에 반복문을 계속한다.
			}
			System.out.println(i);
		}

	}

}
