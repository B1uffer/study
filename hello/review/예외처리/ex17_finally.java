package 예외처리;

public class ex17_finally {

	public static void main(String[] args) {
		
		try {
			
			startInstall();		// 프로그램 설치에 필요한 준비를 하는 코드
			copyFiles();		// 파일을 복사하는 코드
			// 여기서 보통 설치가 완료됨
			
			deleteTempFiles();	// 프로그램 설치에 사용된 임시파일들을 삭제하는 코드
			// 그리고 설치에 사용된 임시파일들을 삭제함
			
			
		} catch(Exception e) {
			
			e.printStackTrace();
			deleteTempFiles();		// 프로그램 설치에 사용된 임시파일들을 삭제하는 코드
			
			// 프로그램 설치 중에 예외가 발생하더라도 설치에 사용된 임시파일들이 삭제하게끔 catch블럭에 deleteTempFiles(); 를 넣음
			
			
		} finally {
			
			
			
		}

	}

	
	static void startInstall() {
		
		// 프로그램 설치에 필요한 준비를 하는 코드
		
	}
	
	static void copyFiles() {
		
		// 파일들을 복사하는 코드
		
	}
	
	static void deleteTempFiles() {
		
		// 임시 파일들을 삭제하는 코드
		
	}
	
}
