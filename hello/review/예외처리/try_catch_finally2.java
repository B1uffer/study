package 예외처리;

public class try_catch_finally2 {

	public static void main(String[] args) {
		
		int[] arr = new int[3];
		
		try {
			
			customFunction(arr);
			
			
		} catch(Exception e) {
			
			System.out.println("예외 발생");
			
		} finally {
			
			
		}

	}
	
	public static void customFunction(int[] arr) throws Exception {
		
		System.out.println("함수 호출");
		System.out.println(arr[5]);		// 여기에서 예외가 발생함
		
		// 이 메서드에 try - catch - finally 구문은 없지만,
		// throws Exception을 통해 발생한 예외를 main 메서드에 보냈다
		// 이를 통해 여러 메서드에서 발생할 수 있는 Exception 예외 등을 한 군데에서 처리할 수 있다..
		
	}

}
