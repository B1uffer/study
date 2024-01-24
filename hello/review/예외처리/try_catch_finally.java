package 예외처리;

public class try_catch_finally {

	public static void main(String[] args) {
		
		int[] arr = new int[3];		// 크기가 3인 배열(0~2) 선언
		
		try {
			
			System.out.println(arr[3]);		// index 3에 접근 시도
			System.out.println(arr[2]);
			
		} catch(Exception e) {		// ArrayIndexOutOfBoundsException 예외 발생
			
			System.out.println("오류 발생!");
			
		} finally {
			
			System.out.println("finally");
			
		}

	}

}
		

		// catch의 역할은 지정한 예외(Exception)가 발생했을 때의 동작을 정의할 수 있도록 도와줌
		// finally는 try - catch구문이 끝났을 때 할 동작을 정의할 수 있는 키워드임
		