package 객체지향_프로그래밍1;

public class ex15_재귀호출_팩토리얼 {

	public static void main(String[] args) {
		
		int result = factorial(5);
		
		System.out.println(result);
		

	}

	static int factorial(int n) {
		int result = 0;
		
		if(n==0) {
			result = 1;	// 0!일때 1
		} else {
			result = n * factorial(n-1);	// n!=0일 경우 이를 실행
		}
		
		// if(n==1) {
		// 	return 1;
		// }
		//
		// return n * factorial(n-1); 
		// 이와 같이 간단하게 코드를 입력할 수도 있다
		
		
		// 이보다 더 간단하고 빠른 코드를 입력하는 방법 : while
		// int result =1;
		// while(n!=0) {
		//   result *= n--;
		// }
		// return result;
		
		
		// if(n <= 0 || n > 12) { , 매개변수 n의 유효성 검사를 추가할 수 있다
		//    return -1;
		// }
		// if(n==1) {
		// return 1;
		// }
		// 
		// 매개변수 n의 상한값이 12인 이유 : 13!의 값이 int의 최대값보다 크기 때문
		
		
		return result;
	}
}
