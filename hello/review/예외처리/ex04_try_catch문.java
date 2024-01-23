package 예외처리;

public class ex04_try_catch문 {

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		
		try {
			
			System.out.println(3);
			System.out.println(4);
			
		} catch(Exception e) {
			
			System.out.println(5);		// 얘는 try - catch문 안에 있는 System.out.println();
										// 예외가 발생하면 실행된다
			
		}
			
		System.out.println(6);
	}

}
