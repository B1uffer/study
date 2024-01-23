package 예외처리;

public class ex08_printStackTrace_getMessage {

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		
		try {
			
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
			
		} catch(ArithmeticException ae) {
			
			ae.printStackTrace();
			System.out.println("예외 메세지 : " + ae.getMessage());
			
		}	// try - catch문 끝

		System.out.println(6);
		
	}

}
