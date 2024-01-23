package 예외처리;

public class ex05_try_catch문2 {

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		
		try {
			
			System.out.println(3);
			System.out.println(0/0);		// 0으로 0을 나누지만 아무튼 실행된다
			
			System.out.println(4);			// 얘 지나침
			
		} catch(ArithmeticException e) {
			
			System.out.println(5);
			
			
		}		// try - catch문의 끝

		System.out.println(6);
		
	}
		
}


		// 메커니즘
		// 1, 2 ,3 까지 정상 실행
		// 0으로 0을 나눌 수 없으므로(int형이기 때문에)
		// System.out.println(0/0); 에서 catch문으로 바로 넘어감
		// 0으로 0으로 나누는 예외는 ArithmeticException이므로 그에 해당하는 catch문을 찾음
		// 거기서 System.out.println(5); 를 실행함
		// catch문을 실행했으니 "try - catch문을 빠져나옴"
		// 그 후에 바로 밑에 있는 System.out.println(6); 을 실행함
		// 프로그램 끝!

		// System.out.println(0/0); 에서 catch문으로 바로 이동했으니 System.out.println(4);를 패스하는 결과를 낳는다