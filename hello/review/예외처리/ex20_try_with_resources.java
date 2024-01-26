package 예외처리;

public class ex20_try_with_resources {

	public static void main(String[] args) {
		
		
		try(CloseableResource cr = new CloseableResource()){
			
			cr.exceptionWork(false);		// boolean = false이므로 exception = false 예외가 발생하지 않음
			
			
		} catch(WorkException e) {
			
			e.printStackTrace();
			
			System.out.println();
			
		} catch(CloseException e) {		// CloseException이 발생함. close()에서 예외가 발생한 것
			
			e.printStackTrace();
			
			System.out.println();
			
		}
		
		System.out.println();
			
		
		try (CloseableResource cr = new CloseableResource()){
			
			cr.exceptionWork(true);		// boolean = true에서 exception = true가 되므로 예외가 발생함
			
		} catch(WorkException e) {		// true이므로 WorkException이 발생함
			
			e.printStackTrace();
			
			System.out.println();
			
		} catch(CloseException e) {		// CloseException도 발생하게 됨
			
			e.printStackTrace();
			
			System.out.println();
			
		}
		

	}

}
