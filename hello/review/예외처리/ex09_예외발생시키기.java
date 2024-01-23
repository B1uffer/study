package 예외처리;

public class ex09_예외발생시키기 {
	public static void main(String args[]) {
	
	
	try {
		
		Exception e = new Exception("일부러 예외를 발생시켰음 ㅋㅋ셈");
		throw e;		// 여기서 예외가발생
		
		// throw new Exception("고의로 발생시킴");
		
	} catch(Exception e) {
		
		System.out.println("에러 메세지 : " + e.getMessage());
		e.printStackTrace();		// 예외발생 당시 호출스택(Call Stack)에 있던 메서드의 정보와 예외 메세지를 화면에 출력해줌
		
		
	}
	
	System.out.println("프로그램이 정상적으로 종료되었음 ㅋ_ㅋ");
	
	}
}
