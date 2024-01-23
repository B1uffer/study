package 예외처리;

public class ex10_예외발생시키기2 {

	public static void main(String[] args) {
		
		// throw new Exception();
		
		
		 try {
			
			throw new Exception();
			
		} catch(Exception e) {
				
			System.out.println("예외를 강제로 발생시킴");
			
			e.printStackTrace();
			
		} 
		

	}

}


		// 주석처리 해둔 것에 대해서
		// 저 Exception(); 은 모든 예외들에 대한 조상임 (그 위는 Object)
		// 아무튼 모든 예외의 조상인 Exception() 인스턴스를 생성할 때 throw를 활용해서 강제로 예외를 발생시키면,
		// 컴파일 조차 되지 않는다. 왜?
		// 그 이유는 Exception()은 모든 예외에 대한 조상이므로 얘를 강제로 예외처리 해버리면 모든 예외구문에 대한 예외처리가 되므로
		// Exception() 클래스의 자손들에 대해서 하나 하나 예외처리를 해주지 않으면 컴파일조차 되지 않는다...
		
		// 아래 try - catch문의 경우 예외처리를 해주었기 때문에 실행이 된다