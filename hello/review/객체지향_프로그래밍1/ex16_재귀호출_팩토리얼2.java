package 객체지향_프로그래밍1;

public class ex16_재귀호출_팩토리얼2 {

	public static void main(String[] args) {
		
		int n = 21;
		long result = 0;		// result의 값 초기화
		
		for(int i=1; i<=n; i++) {
			result = factorial(i);		// factorial 메서드에 i를 대입
			
			if(result == -1) {		// result = -1;이라면
				System.out.printf("유효하지 않은 값입니다.(0<n<=20) : %d%n",n);
				break;

			}
			
			System.out.printf("%2d!=%20d%n", i, result);
		}

	}

	
	static long factorial(int n) {
		
		// 유효성 검사
		if(n<=0 || n>20) {
			return -1;
			
		}
		
		// 유효성 검사 2
		if(n<=1) {
			return 1;
		}
		
		return n * factorial(n-1);

	}
}
