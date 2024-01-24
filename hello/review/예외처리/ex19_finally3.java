package 예외처리;

public class ex19_finally3 {

	public static void main(String[] args) {
		
		 ex19_finally3.method1();
		 
		 System.out.println("method1의 수행을 마치고 main메서드로 돌아옴");

	}

	
	static void method1() {
		
		try {
			System.out.println("method1이 호출됨");
			return;			// 현재 실행중인 메서드를 종료함.. 즉 method1();을 종료한다는 의미
			
		} catch(Exception e) {
			
			e.printStackTrace();		// 뭔 예외가 뜬건지 알려줌
			
			
		} finally {
			
			System.out.println("method1(); finally 블럭이 정상적으로 실행됨");
			
		}
		
	}
}


	// catch문에 return문이 존재해도 마찬가지로 try문 실행 - catch문 실행 - finally문 실행이 정상적으로 이루어진다.