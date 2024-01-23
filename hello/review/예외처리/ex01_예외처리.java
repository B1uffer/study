package 예외처리;

public class ex01_예외처리 {
	public static void main(String[] args) {

		// try - catch문

		try { // 첫 번째 try문
			try {				// 첫 번째 try문 안에 있는 두번째 try문

			} catch (Exception e) {		// 두 번째 try문에 대한 catch문, 첫 번째 Exception에 대한 변수 e

			}
		} catch (Exception e) { // 첫 번째 try문에 대한 catch문
			try {		// 첫 번째 try문에 대응하는 catch문 안에 있는 세 번째 try문

			} catch (Exception e2) {		// 이 Exception의 변수를 e로 설정하면 중복되어 에러가 발생함
											// 왜냐하면 첫 번째 try문에 대한 catch문의 Exception 타입의 매개변수 e가 이미 있기 때문
			}
		
		} // try - catch문 끝
			
		
		try {
			
		} catch (Exception e) { 
			
		} // try - catch문의 끝
		
		
		try {
			try { } catch (Exception e) { }		// try문 안에 try - catch가 들어갈 수 있다
			
		} catch (Exception e) {					// catch문 안에도 try - catch가 들어갈 수 있다
			try { } catch (Exception e2) { }	// 다만 catch문은 매개변수가 지정되기 때문에 내부 try - catch의 매개변수가 중복되지 않아야 한다
			
		}
		
		
		
	} // main 끝

}
