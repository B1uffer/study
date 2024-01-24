package 예외처리;

public class ex18_finally2 {

	public static void main(String[] args) {
		// ex17과 기능은 똑같지만 finally를 활용함
		
		try {
			
			startInstall();
			copyFiles();
			// deleteTempFiles(); 이걸 try에 적지 않고 finally 블럭에 적는다
			
			
		} catch(Exception e) {
			
			e.printStackTrace();
			// 무슨 이유에서 예외가 발생했는지 출력해줌
			
			
		} finally {
			
			deleteTempFiles();
			// finally블럭에 임시파일들을 제거하는 메서드를 넣음
			
		}

	}

	static void startInstall() {
		
		// 프로그램 설치에 필요한 준비를 하는 코드
		
	}
	
	static void copyFiles() {
		
		// 파일 복사 코드
		
	}
	
	static void deleteTempFiles() {
		
		// 설치에 필요한 임시파일들을 삭제하는 코드
		
	}
	
}
