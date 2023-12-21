package 객체지향_프로그래밍1;

public class ex18_제곱합구하기 {

	public static void main(String[] args) {
		
		// x^1 에서 x^n까지의 합 구하기
		
		int x = 2;
		int n = 5;
		long result = 0;
		
		for(int i=1; i <= n; i++) {
			result += power(x, i);		// power(2, 5)에서 power(2, 1)까지 계속 더함
			
		}
		
		System.out.println(result);		// 그 결과값
		

	}
	
	static long power(int x, int n) {		// int 2, int 5일 때
		if(n==1) {		// 유효성 검사
			return x;
			
		}
		// f(x, n) = x * f(x, n-1) 단, f(x, 1) = x
		return x * power(x, n-1);		// return 2 * power(2, 4);에서 4가 1일 될 때까지 곱함
	}	
}
